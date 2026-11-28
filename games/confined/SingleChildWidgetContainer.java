/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class SingleChildWidgetContainer extends UiWidget implements WidgetContainerMarker {
    UiWidget field_H;
    static int[] field_I;

    private final boolean focusNextChild(UiWidget param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -42) {
            this.field_H = (UiWidget) null;
          }
          stackIn_7_0 = (this.field_H != null) && (!this.field_H.isFocused((byte) 107)) && (this.field_H.takeFocus(param0, 418));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("am.IA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    void pointerReleased(int param0, int param1, int param2, UiWidget param3, int param4, int param5) {
        UiWidget var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.field_H != null) {
            this.field_H.pointerReleased(-61, this.field_m + param1, param2, param3, param4, param5 + this.field_q);
          }
          if (param0 > -18) {
            var8 = (UiWidget) null;
            this.handleWheel(-77, -117, (byte) 21, (UiWidget) null, 34, -52, -69);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("am.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    StringBuilder appendDebugTree(StringBuilder param0, int param1, Hashtable param2, boolean param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3) {
            this.layoutChild(-102);
          }
          if (this.beginDebugTreeEntry((byte) -13, param1, param2, param0)) {
            this.appendDebugProperties(param0, param2, (byte) -63, param1);
            this.appendChildDebugTree(param2, 3803, param0, param1);
          }
          stackIn_6_0 = (StringBuilder) (param0);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("am.O(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    void layoutChild(int param0) {
        if (param0 > -49) {
          CharSequence var3 = (CharSequence) null;
          SingleChildWidgetContainer.a(-97, (CharSequence) null);
        }
        if (this.field_H != null) {
          this.field_H.refreshLayout(60);
        }
    }

    final void appendChildDebugTree(Hashtable param0, int param1, StringBuilder param2, int param3) {
        StringBuilder discarded$22 = null;
        int var5_int = 0;
        StringBuilder discarded$24 = null;
        StringBuilder discarded$23 = null;
        int var6 = 0;
        UiWidget var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          discarded$22 = param2.append('\n');
          if (param1 != 3803) {
            var7 = (UiWidget) null;
            this.takeFocus((UiWidget) null, 9);
          }
          for (var5_int = 0; var5_int <= param3; var5_int++) {
            discarded$24 = param2.append(' ');
          }
          if (null == this.field_H) {
            discarded$23 = param2.append("null");
          } else {
            this.field_H.appendDebugTree(param2, param3 + 1, param0, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("am.BA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    UiWidget getFocusedChild(byte param0) {
        if (param0 != -110) {
          this.field_H = (UiWidget) null;
        }
        UiWidget var2 = this.field_H;
        if (var2 == null) {
          return null;
        }
        if (var2.isFocused((byte) 63)) {
          return var2;
        }
        return null;
    }

    String getTooltipText(byte param0) {
        String var3 = null;
        if (param0 >= -82) {
          this.drawWidget(-89, 75, (byte) -88, -37);
        }
        String var2 = super.getTooltipText((byte) -117);
        if (null != this.field_H) {
          var3 = this.field_H.getTooltipText((byte) -87);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    final boolean handleWheel(int param0, int param1, byte param2, UiWidget param3, int param4, int param5, int param6) {
        boolean discarded$1 = false;
        RuntimeException var8 = null;
        UiWidget var9 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 36) {
            var9 = (UiWidget) null;
            discarded$1 = this.focusPreviousChild((UiWidget) null, 115);
          }
          stackIn_7_0 = (null != this.field_H) && (this.field_H.isFocused((byte) -128)) && (this.field_H.handleWheel(param0, param1, (byte) 36, param3, param4, param5, param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("am.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    boolean pointerPressed(int param0, int param1, byte param2, int param3, UiWidget param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 91) {
            this.field_H = (UiWidget) null;
          }
          stackIn_6_0 = (this.field_H != null) && (this.field_H.pointerPressed(this.field_q + param0, param1, (byte) 91, this.field_m + param3, param4, param5, param6));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("am.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean takeFocus(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 418) {
            this.field_H = (UiWidget) null;
          }
          stackIn_6_0 = (null != this.field_H) && (this.field_H.takeFocus(param0, param1 ^ 0));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("am.I(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void blur(int param0) {
        if (this.field_H != null) {
          this.field_H.blur(84);
        }
        if (param0 != 84) {
          UiWidget var3 = (UiWidget) null;
          this.takeFocus((UiWidget) null, -62);
        }
    }

    void drawWidget(int param0, int param1, byte param2, int param3) {
        if (param2 <= 36) {
          return;
        }
        if (param1 == 0 &&
          null != this.field_n) {
          this.field_n.paintWidget((byte) -125, param3, true, (UiWidget) (this), param0);
        }
        if (null != this.field_H) {
          this.field_H.drawWidget(param0 + this.field_m, param1, (byte) 100, this.field_q + param3);
        }
    }

    final boolean handleKey(UiWidget param0, byte param1, int param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -29 / ((47 - param1) / 43);
          if (this.field_H != null &&
            this.field_H.isFocused((byte) -123) &&
            this.field_H.handleKey(param0, (byte) -59, param2, param3)) {
            return true;
          }
          var6 = param2;
          if (80 != var6) {
            return false;
          }
          if (!mc.field_e[81]) {
            stackIn_10_0 = this.focusNextChild(param0, (byte) -42);
          } else {
            stackIn_10_0 = this.focusPreviousChild(param0, -7244);
          }
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("am.Q(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void g(int param0) {
        int var1_int = 0;
        int var2 = Confined.field_J ? 1 : 0;
        int var1_intLifetime1;
        try {
          ProjectileRay.field_gb.resetTiming((byte) 31);
          if (param0 != -4258) {
            CharSequence var3 = (CharSequence) null;
            SingleChildWidgetContainer.a(-36, (CharSequence) null);
          }
          for (var1_int = 0; var1_int < 32; var1_int++) {
            wg.field_d[var1_int] = 0L;
          }
          for (var1_intLifetime1 = 0; var1_intLifetime1 < 32; var1_intLifetime1++) {
            of.field_c[var1_intLifetime1] = 0L;
          }
          Confined.field_D = 0;
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "am.HA(" + param0 + ')');
        }
    }

    public static void clearStaticReferences(boolean param0) {
        if (!param0) {
          return;
        }
        field_I = null;
    }

    final static String a(int param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = hd.a(DebouncedFieldValidator.a(param1, 119), (byte) 112);
          if (var2 == null) {
            var2 = "";
          }
          if (param0 > 47) {
            stackIn_6_0 = var2;
            return stackIn_6_0;
          }
          stackIn_4_0 = (String) null;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("am.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final boolean isFocused(byte param0) {
        int var2 = -79 % ((-74 - param0) / 49);
        return this.getFocusedChild((byte) -110) != null ? true : false;
    }

    SingleChildWidgetContainer(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetEventListener param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          java.net.URL var4 = null;
          try {
            try {
              var4 = param1.getCodeBase();
              var3 = pn.a(var4, (byte) -33, param1).getFile();
              JavaScriptBridge.callWithArguments((byte) 53, "updatelinks", param1, new Object[]{"home", var3 + "home.ws"});
              JavaScriptBridge.callWithArguments((byte) 53, "updatelinks", param1, new Object[]{"gamelist", var3 + "togamelist.ws"});
              JavaScriptBridge.callWithArguments((byte) 53, "updatelinks", param1, new Object[]{"serverlist", var3 + "toserverlist.ws"});
              JavaScriptBridge.callWithArguments((byte) 53, "updatelinks", param1, new Object[]{"options", var3 + "options.ws"});
              JavaScriptBridge.callWithArguments((byte) 53, "updatelinks", param1, new Object[]{"terms", var3 + "terms.ws"});
              if (param0 < 16) {
                field_I = (int[]) null;
              }
              JavaScriptBridge.callWithArguments((byte) 53, "updatelinks", param1, new Object[]{"privacy", var3 + "privacy.ws"});
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("am.KA(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw TextLineMetrics.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int getMaximumRenderLayer(int param0) {
        if (param0 <= 65) {
          SingleChildWidgetContainer.clearStaticReferences(true);
        }
        return this.field_H != null ? this.field_H.getMaximumRenderLayer(94) : 0;
    }

    final static void a(int param0, byte param1, int param2, int param3) {
        TextLineMetrics.field_b = param3;
        cg.field_a = param0;
        GzipDecompressor.field_c = param2;
        int var4 = 25 % ((77 - param1) / 33);
    }

    private final boolean focusPreviousChild(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -7244) {
            this.setBounds(87, -104, -99, 35, 47);
          }
          stackIn_7_0 = (this.field_H != null) && (!this.field_H.isFocused((byte) 62)) && (this.field_H.takeFocus(param0, 418));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("am.JA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        super.setBounds(-128, param1, param2, param3, param4);
        if (param0 > -109) {
          field_I = (int[]) null;
        }
        this.layoutChild(-94);
    }

    void updatePointer(UiWidget param0, int param1, int param2, int param3) {
        super.updatePointer(param0, param1 ^ 0, param2, param3);
        if (param1 != 11579568) {
          return;
        }
        try {
          if (this.field_H != null) {
            this.field_H.updatePointer(param0, param1 + 0, this.field_q + param2, param3 + this.field_m);
          }
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "am.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
    }
}
