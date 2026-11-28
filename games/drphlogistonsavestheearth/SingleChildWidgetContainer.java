/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class SingleChildWidgetContainer extends UiWidget implements WidgetContainerMarker {
    static db field_A;
    UiWidget field_z;
    static he[] field_G;
    static RgbSprite field_F;
    static boolean[] field_C;
    static ResourceArchive field_E;
    static int field_B;
    static he field_D;

    void layoutChild(int param0) {
        if (param0 == 0) {
          if (null != this.field_z) {
            this.field_z.refreshLayout((byte) 38);
          }
          return;
        }
        field_G = (he[]) null;
        if (null != this.field_z) {
          this.field_z.refreshLayout((byte) 38);
        }
    }

    final boolean handleKey(int param0, char param1, UiWidget param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= 63) {
            return false;
          }
          if (null != this.field_z &&
            this.field_z.isFocused(true) &&
            this.field_z.handleKey(param0, param1, param2, 74)) {
            return true;
          }
          var5_int = param0;
          if (var5_int != 80) {
            return false;
          }
          if (ck.field_f[81]) {
            stackIn_13_0 = this.focusPreviousChild(0, param2);
          } else {
            stackIn_13_0 = this.focusNextChild(param2, 6);
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("si.BA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean handleWheel(int param0, int param1, byte param2, int param3, UiWidget param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 43) {
            SingleChildWidgetContainer.f(-83);
          }
          stackIn_7_0 = (null != this.field_z) && (this.field_z.isFocused(true)) && (this.field_z.handleWheel(param0, param1, (byte) 113, param3, param4, param5, param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("si.AB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    String getTooltipText(int param0) {
        String var2 = super.getTooltipText(-93);
        if (null == this.field_z) {
          if (param0 > -39) {
            field_B = 63;
            return var2;
          }
          return var2;
        }
        String var3 = this.field_z.getTooltipText(-71);
        if (var3 != null) {
          return var3;
        }
        if (param0 > -39) {
          field_B = 63;
          return var2;
        }
        return var2;
    }

    UiWidget getFocusedChild(int param0) {
        int var2 = -51 % ((-28 - param0) / 57);
        UiWidget var3 = this.field_z;
        if (var3 == null) {
          return null;
        }
        if (var3.isFocused(true)) {
          return var3;
        }
        return null;
    }

    boolean pointerPressed(int param0, UiWidget param1, int param2, byte param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= 113) {
            field_E = (ResourceArchive) null;
          }
          stackIn_6_0 = (null != this.field_z) && (this.field_z.pointerPressed(param0, param1, param2, (byte) 123, param4, param5 + this.field_o, this.field_m + param6));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("si.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void drawWidget(int param0, int param1, byte param2, int param3) {
        if (param1 == 0 &&
          this.field_l != null) {
          this.field_l.paintWidget(true, param2 + 143, (UiWidget) (this), param3, param0);
        }
        if (param2 != -21) {
          field_G = (he[]) null;
        }
        if (null != this.field_z) {
          this.field_z.drawWidget(this.field_o + param0, param1, (byte) -21, this.field_m + param3);
        }
    }

    private final boolean focusNextChild(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 6) {
            field_B = -60;
          }
          stackIn_7_0 = (null != this.field_z) && (!this.field_z.isFocused(true)) && (this.field_z.takeFocus(false, param0));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("si.O(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    StringBuilder appendDebugTree(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -10612) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.beginDebugTreeEntry(param1, param2, param0, 92)) {
            this.appendDebugProperties(param2, (byte) 89, param0, param1);
            this.appendChildDebugTree(10, param2, param0, param1);
          }
          stackIn_7_0 = (StringBuilder) (param2);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("si.WA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final int getMaximumRenderLayer(int param0) {
        if (param0 == 3) {
          return null != this.field_z ? this.field_z.getMaximumRenderLayer(3) : 0;
        }
        field_F = (RgbSprite) null;
        return null != this.field_z ? this.field_z.getMaximumRenderLayer(3) : 0;
    }

    SingleChildWidgetContainer(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetEventListener param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final void appendChildDebugTree(int param0, StringBuilder param1, int param2, Hashtable param3) {
        StringBuilder discarded$3 = null;
        int var5_int = 0;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$4 = null;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          discarded$3 = param1.append((char)param0);
          for (var5_int = 0; param2 >= var5_int; var5_int++) {
            discarded$5 = param1.append(' ');
          }
          if (this.field_z == null) {
            discarded$4 = param1.append("null");
            return;
          }
          this.field_z.appendDebugTree(param2 + 1, param3, param1, -10612);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("si.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void blur(byte param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (this.field_z == null) {
          var2 = -113 / ((-10 - param0) / 51);
          return;
        }
        this.field_z.blur((byte) -93);
        var2Lifetime1 = -113 / ((-10 - param0) / 51);
    }

    final static void f(int param0) {
        cj.field_h = new he[8];
        cj.field_h[4] = PacketBuffer.field_k;
        cj.field_h[2] = MusicPatchEnvelope.field_b;
        cj.field_h[1] = NodeHashTableIterator.field_d;
        cj.field_h[0] = ImageProducerRasterBuffer.field_o;
        if (param0 == 10) {
          cj.field_h[5] = qc.field_a;
          cj.field_h[6] = p.field_e;
          cj.field_h[3] = of.field_x;
          cj.field_h[7] = c.field_a[0];
          return;
        }
    }

    private final boolean focusPreviousChild(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            field_D = (he) null;
          }
          stackIn_7_0 = (null != this.field_z) && (!this.field_z.isFocused(true)) && (this.field_z.takeFocus(false, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("si.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean isFocused(boolean param0) {
        if (!param0) {
          return true;
        }
        return null != this.getFocusedChild(115) ? true : false;
    }

    void updatePointer(UiWidget param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        UiWidget var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.updatePointer(param0, param1, param2, (byte) -128);
          if (param3 > -127) {
            var6 = (UiWidget) null;
            this.pointerPressed(22, (UiWidget) null, -5, (byte) 124, 57, 35, -88);
          }
          if (null == this.field_z) {
            return;
          }
          this.field_z.updatePointer(param0, param1 + this.field_o, this.field_m + param2, (byte) -128);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("si.I(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        super.setBounds(param0, param1, param2, param3, param4);
        this.layoutChild(0);
    }

    public static void g(int param0) {
        field_F = null;
        field_C = null;
        field_E = null;
        if (param0 == 6714) {
          field_A = null;
          field_D = null;
          field_G = null;
          return;
        }
        SingleChildWidgetContainer.f(94);
        field_A = null;
        field_D = null;
        field_G = null;
    }

    void pointerReleased(int param0, int param1, int param2, UiWidget param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5) {
            this.drawWidget(-71, 74, (byte) -81, 61);
          }
          if (null == this.field_z) {
            return;
          }
          this.field_z.pointerReleased(param0 + this.field_o, this.field_m + param1, param2, param3, param4, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("si.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final boolean takeFocus(boolean param0, UiWidget param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            return false;
          }
          stackIn_7_0 = (this.field_z != null) && (this.field_z.takeFocus(param0, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("si.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_A = new db(2);
        field_C = new boolean[]{false, false, false, false};
    }
}
