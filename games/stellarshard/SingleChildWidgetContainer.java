/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class SingleChildWidgetContainer extends UiWidget implements WidgetContainerMarker {
    UiWidget field_y;
    static ModalDialogHost field_z;

    public static void clearStaticReferences(int param0) {
        if (param0 != 32) {
          field_z = (ModalDialogHost) null;
        }
        field_z = null;
    }

    final boolean takeFocus(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -2147483648) {
            return true;
          }
          stackIn_7_0 = (null != this.field_y) && (this.field_y.takeFocus(-2147483648, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("dg.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void appendChildDebugTree(int param0, StringBuilder param1, Hashtable param2, int param3) {
        StringBuilder discarded$3 = null;
        int var5_int = 0;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$4 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = stellarshard.field_B;
        try {
          discarded$3 = param1.append('\n');
          for (var5_int = 0; var5_int <= param3; var5_int++) {
            discarded$5 = param1.append(' ');
          }
          if (param0 != -81) {
            return;
          }
          if (this.field_y == null) {
            discarded$4 = param1.append("null");
          } else {
            this.field_y.appendDebugTree(param3 + 1, false, param1, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("dg.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    void pointerReleased(int param0, int param1, UiWidget param2, int param3, int param4, int param5) {
        try {
          if (null != this.field_y) {
            this.field_y.pointerReleased(param0, -126, param2, this.field_w + param3, param4 + this.field_k, param5);
          }
          int var7_int = -107 % ((-50 - param1) / 57);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "dg.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean isFocused(int param0) {
        boolean discarded$0 = false;
        if (param0 != 0) {
          UiWidget var3 = (UiWidget) null;
          discarded$0 = this.focusPreviousChild(false, (UiWidget) null);
        }
        return this.getFocusedChild(257) != null ? true : false;
    }

    final static void g(int param0) {
        if (param0 != 16608) {
          SingleChildWidgetContainer.clearStaticReferences(58);
        }
        rh.a(17, (byte) -72);
    }

    final boolean handleWheel(int param0, int param1, UiWidget param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 <= 30) {
            this.field_y = (UiWidget) null;
          }
          stackIn_7_0 = (this.field_y != null) && (this.field_y.isFocused(0)) && (this.field_y.handleWheel(param0, param1, param2, param3, 38, param5, param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("dg.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static AccountServiceResult createAccountSuccessResult(boolean param0, int param1) {
        AccountServiceResult var2 = new AccountServiceResult(true);
        if (param1 != 0) {
          field_z = (ModalDialogHost) null;
        }
        var2.field_a = param0 ? true : false;
        return var2;
    }

    final void blur(boolean param0) {
        if (!param0) {
          this.drawWidget(-30, (byte) -11, 55, -83);
        }
        if (this.field_y != null) {
          this.field_y.blur(true);
        }
    }

    void drawWidget(int param0, byte param1, int param2, int param3) {
        if (param0 == 0 &&
          null != this.field_u) {
          this.field_u.paintWidget(true, param3, param2, (UiWidget) (this), 4549);
        }
        if (param1 != -57) {
          return;
        }
        if (null != this.field_y) {
          this.field_y.drawWidget(param0, (byte) -57, param2 + this.field_k, param3 + this.field_w);
        }
    }

    String getTooltipText(int param0) {
        String var3 = null;
        String var2 = super.getTooltipText(param0);
        if (this.field_y != null) {
          var3 = this.field_y.getTooltipText(3690);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    final boolean handleKey(int param0, int param1, char param2, UiWidget param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        UiWidget var6 = null;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.field_y &&
            this.field_y.isFocused(0) &&
            this.field_y.handleKey(29657, param1, param2, param3)) {
            return true;
          }
          if (param0 != 29657) {
            var6 = (UiWidget) null;
            this.pointerPressed((UiWidget) null, -24, -59, -50, 25, (byte) -57, -73);
          }
          var5_int = param1;
          if (var5_int != 80) {
            return false;
          }
          if (si.field_jb[81]) {
            stackIn_11_0 = this.focusPreviousChild(true, param3);
          } else {
            stackIn_11_0 = this.focusNextChild(true, param3);
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("dg.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    UiWidget getFocusedChild(int param0) {
        if (param0 != 257) {
          field_z = (ModalDialogHost) null;
        }
        UiWidget var2 = this.field_y;
        if (var2 == null) {
          return null;
        }
        if (var2.isFocused(0)) {
          return var2;
        }
        return null;
    }

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        super.setBounds(param0, param1, param2, param3, param4);
        this.layoutChild((byte) 79);
    }

    void updatePointer(int param0, boolean param1, int param2, UiWidget param3) {
        Hashtable var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1) {
            var6 = (Hashtable) null;
            this.appendChildDebugTree(111, (StringBuilder) null, (Hashtable) null, 2);
          }
          super.updatePointer(param0, param1, param2, param3);
          if (null != this.field_y) {
            this.field_y.updatePointer(this.field_k + param0, param1, this.field_w + param2, param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("dg.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    boolean pointerPressed(UiWidget param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 < 24) {
            return true;
          }
          stackIn_7_0 = (this.field_y != null) && (this.field_y.pointerPressed(param0, param1, param2, param3, this.field_w + param4, (byte) 109, param6 + this.field_k));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("dg.P(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    SingleChildWidgetContainer(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetEventListener param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final int getMaximumRenderLayer(boolean param0) {
        if (param0) {
          this.getTooltipText(-101);
        }
        return null != this.field_y ? this.field_y.getMaximumRenderLayer(false) : 0;
    }

    private final boolean focusNextChild(boolean param0, UiWidget param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            SingleChildWidgetContainer.g(-100);
          }
          stackIn_7_0 = (null != this.field_y) && (!this.field_y.isFocused(0)) && (this.field_y.takeFocus(-2147483648, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("dg.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    StringBuilder appendDebugTree(int param0, boolean param1, StringBuilder param2, Hashtable param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginDebugTreeEntry((byte) -120, param3, param2, param0)) {
            this.appendDebugProperties((byte) 111, param0, param2, param3);
            this.appendChildDebugTree(-81, param2, param3, param0);
          }
          if (param1) {
            this.drawWidget(118, (byte) 62, -12, 90);
          }
          stackIn_6_0 = (StringBuilder) (param2);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("dg.T(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final boolean focusPreviousChild(boolean param0, UiWidget param1) {
        RuntimeException var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            return false;
          }
          stackIn_8_0 = (this.field_y != null) && (!this.field_y.isFocused(0)) && (this.field_y.takeFocus(-2147483648, param1));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("dg.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    void layoutChild(byte param0) {
        if (null != this.field_y) {
          this.field_y.refreshLayout(0);
        }
        if (param0 != 79) {
          this.field_y = (UiWidget) null;
        }
    }

    static {
    }
}
