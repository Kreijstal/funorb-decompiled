/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class SingleChildWidgetContainer extends UiWidget implements WidgetContainerMarker {
    UiWidget field_y;
    static String field_z;
    static gj field_x;

    void drawWidget(int param0, int param1, int param2, int param3) {
        if (param2 != 1048575) {
          UiWidget var6 = (UiWidget) null;
          this.pointerPressed((byte) -108, (UiWidget) null, 80, 49, -111, 20, 18);
        }
        if (param1 == 0 &&
          this.field_j != null) {
          this.field_j.paintWidget(param0, param3, (UiWidget) (this), -4394, true);
        }
        if (null != this.field_y) {
          this.field_y.drawWidget(param0 + this.field_n, param1, param2 + 0, param3 + this.field_s);
        }
    }

    public static void clearStaticReferences(byte param0) {
        if (param0 < 56) {
          return;
        }
        field_z = null;
        field_x = null;
    }

    void layoutChild(byte param0) {
        int var2 = 23 / ((param0 - 55) / 49);
        if (this.field_y != null) {
          this.field_y.refreshLayout(-26385);
        }
    }

    final boolean handleWheel(boolean param0, int param1, int param2, int param3, int param4, int param5, UiWidget param6) {
        RuntimeException var8 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            return false;
          }
          stackIn_8_0 = (this.field_y != null) && (this.field_y.isFocused(-81)) && (this.field_y.handleWheel(false, param1, param2, param3, param4, param5, param6));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("kj.LA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void i(int param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (ImageProducerRasterBuffer.field_g <= 32) {
          ia.b(0, -23235);
        } else {
          var1 = ImageProducerRasterBuffer.field_g % 32;
          if (var1 == 0) {
            var1 = 32;
          }
          ia.b(ImageProducerRasterBuffer.field_g - var1, -23235);
        }
        var1Lifetime1 = 2 / ((param0 - 56) / 41);
    }

    SingleChildWidgetContainer(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetEventListener param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    String getTooltipText(int param0) {
        String var3 = null;
        String var2 = super.getTooltipText(param0);
        if (null != this.field_y) {
          var3 = this.field_y.getTooltipText(-8235);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    final void blur(int param0) {
        if (null != this.field_y) {
          this.field_y.blur(0);
        }
        if (param0 != 0) {
          UiWidget var3 = (UiWidget) null;
          this.pointerReleased(-33, 14, (byte) 60, (UiWidget) null, 79, -69);
        }
    }

    boolean pointerPressed(byte param0, UiWidget param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -115) {
            this.getTooltipText(-12);
          }
          stackIn_6_0 = (null != this.field_y) && (this.field_y.pointerPressed((byte) -125, param1, param2, param3 + this.field_s, param4, param5, this.field_n + param6));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("kj.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final int getMaximumRenderLayer(int param0) {
        if (param0 != -20598) {
          return 86;
        }
        return null == this.field_y ? 0 : this.field_y.getMaximumRenderLayer(param0 ^ 0);
    }

    final static void j(int param0) {
        DualLinkNode.d(-1);
        il.a(param0, 0);
    }

    void pointerReleased(int param0, int param1, byte param2, UiWidget param3, int param4, int param5) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (null != this.field_y) {
            this.field_y.pointerReleased(param0 + this.field_n, param1, (byte) -128, param3, this.field_s + param4, param5);
          }
          if (param2 > -91) {
            this.getTooltipText(-88);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("kj.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final boolean handleKey(char param0, int param1, UiWidget param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_y != null &&
            this.field_y.isFocused(-81) &&
            this.field_y.handleKey(param0, param1, param2, 0)) {
            return true;
          }
          var5_int = param1;
          if (var5_int == 80) {
            if (IterableNodeHashTable.field_a[81]) {
              stackIn_10_0 = this.focusPreviousChild((byte) -110, param2);
            } else {
              stackIn_10_0 = this.focusNextChild(8740, param2);
            }
            return stackIn_10_0;
          }
          if (param3 == 0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("kj.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    StringBuilder appendDebugTree(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginDebugTreeEntry(9882, param3, param2, param1)) {
            this.appendDebugProperties(param2, (byte) -98, param1, param3);
            this.appendChildDebugTree(param3, param2, -19956, param1);
          }
          if (param0 >= -23) {
            field_x = (gj) null;
          }
          stackIn_5_0 = (StringBuilder) (param3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("kj.C(").append(param0).append(',');
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
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final boolean focusNextChild(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 8740) {
            field_x = (gj) null;
          }
          stackIn_7_0 = (this.field_y != null) && (!this.field_y.isFocused(-81)) && (this.field_y.takeFocus(-81, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("kj.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void appendChildDebugTree(StringBuilder param0, int param1, int param2, Hashtable param3) {
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
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param2 != -19956) {
            return;
          }
          discarded$4 = param0.append('\n');
          for (var5_int = 0; var5_int <= param1; var5_int++) {
            discarded$6 = param0.append(' ');
          }
          if (this.field_y == null) {
            discarded$5 = param0.append("null");
          } else {
            this.field_y.appendDebugTree((byte) -61, param3, 1 + param1, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("kj.OA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final boolean focusPreviousChild(byte param0, UiWidget param1) {
        RuntimeException var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -59) {
            return false;
          }
          stackIn_8_0 = (this.field_y != null) && (!this.field_y.isFocused(-81)) && (this.field_y.takeFocus(-81, param1));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("kj.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    void updatePointer(byte param0, UiWidget param1, int param2, int param3) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.updatePointer(param0, param1, param2, param3);
          if (this.field_y != null) {
            this.field_y.updatePointer((byte) -77, param1, param2 + this.field_s, this.field_n + param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("kj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean isFocused(int param0) {
        if (param0 != -81) {
          field_x = (gj) null;
        }
        return this.getFocusedChild(false) != null ? true : false;
    }

    final void setBounds(int param0, int param1, int param2, byte param3, int param4) {
        super.setBounds(param0, param1, param2, param3, param4);
        this.layoutChild((byte) 127);
    }

    UiWidget getFocusedChild(boolean param0) {
        UiWidget var2 = this.field_y;
        if (var2 != null &&
          var2.isFocused(-81)) {
          return var2;
        }
        if (!param0) {
          return null;
        }
        return (UiWidget) null;
    }

    final static void a(RgbSprite param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        try {
          pa.field_d = param8;
          ok.field_f = param4;
          qb.field_c = param3;
          ld.field_a = param5;
          ba.field_c = param7;
          if (param2 != 45) {
            SingleChildWidgetContainer.clearStaticReferences((byte) -79);
          }
          qf.field_m = param1;
          vg.field_l = param6;
          pf.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "kj.SA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final boolean takeFocus(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -81) {
            field_x = (gj) null;
          }
          stackIn_6_0 = (this.field_y != null) && (this.field_y.takeFocus(param0 + 0, param1));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("kj.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_z = "Loading graphics";
        field_x = null;
    }
}
