/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class SingleChildWidgetContainer extends UiWidget implements WidgetContainerMarker {
    static String field_y;
    static int field_z;
    UiWidget field_A;

    boolean pointerPressed(int param0, int param1, int param2, int param3, byte param4, UiWidget param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != 110) {
            this.layoutChild(72);
          }
          stackIn_6_0 = (this.field_A != null) && (this.field_A.pointerPressed(param0, param1 + this.field_v, this.field_m + param2, param3, (byte) 110, param5, param6));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("fc.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param6).append(')').toString());
        }
    }

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        super.setBounds(param0, param1, param2, param3, param4);
        this.layoutChild(80);
    }

    private final boolean focusNextChild(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 10) {
            field_z = 26;
          }
          stackIn_7_0 = (null != this.field_A) && (!this.field_A.isFocused(param1 ^ -9021)) && (this.field_A.takeFocus((byte) -92, param0));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("fc.AB(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    String getTooltipText(int param0) {
        String var3 = null;
        String var2 = super.getTooltipText((int) (char)param0);
        if (this.field_A != null) {
          var3 = this.field_A.getTooltipText(34);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    final static boolean i(int param0) {
        if (param0 != -1) {
          field_z = -85;
        }
        return la.a(BufferedRandomAccessFile.c(-1), 10295);
    }

    final boolean isFocused(int param0) {
        if (param0 != -9015) {
          SingleChildWidgetContainer.resetStaticState(-9);
        }
        return null != this.getFocusedChild((byte) -83) ? true : false;
    }

    void drawWidget(int param0, int param1, byte param2, int param3) {
        if (param2 <= 42) {
          UiWidget var6 = (UiWidget) null;
          this.takeFocus((byte) 70, (UiWidget) null);
        }
        if (param3 == 0 &&
          null != this.field_h) {
          this.field_h.paintWidget(param0, param1, 15430, (UiWidget) (this), true);
        }
        if (this.field_A != null) {
          this.field_A.drawWidget(param0 + this.field_m, this.field_v + param1, (byte) 104, param3);
        }
    }

    final void blur(byte param0) {
        int var2 = 53 / ((-27 - param0) / 39);
        if (this.field_A != null) {
          this.field_A.blur((byte) 59);
        }
    }

    SingleChildWidgetContainer(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetEventListener param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    private final boolean focusPreviousChild(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -123) {
            return false;
          }
          stackIn_8_0 = (null != this.field_A) && (!this.field_A.isFocused(-9015)) && (this.field_A.takeFocus((byte) -120, param0));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("fc.DA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    UiWidget getFocusedChild(byte param0) {
        UiWidget var2 = this.field_A;
        if (param0 != -83) {
          return (UiWidget) null;
        }
        if (var2 == null) {
          return null;
        }
        if (!var2.isFocused(-9015)) {
          return null;
        }
        return var2;
    }

    final boolean handleWheel(int param0, int param1, int param2, int param3, UiWidget param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 0) {
            this.field_A = (UiWidget) null;
          }
          stackIn_7_0 = (null != this.field_A) && (this.field_A.isFocused(param3 - 9015)) && (this.field_A.handleWheel(param0, param1, param2, 0, param4, param5, param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("fc.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void resetStaticState(int param0) {
        field_y = null;
        if (param0 != 1) {
          field_z = 55;
        }
    }

    void updatePointer(UiWidget param0, int param1, int param2, int param3) {
        try {
          super.updatePointer(param0, param1, param2 ^ param2, param3);
          if (null != this.field_A) {
            this.field_A.updatePointer(param0, param1 + this.field_m, 0, this.field_v + param3);
          }
        } catch (RuntimeException runtimeException) {
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "fc.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    void pointerReleased(int param0, int param1, int param2, int param3, UiWidget param4, int param5) {
        boolean discarded$1 = false;
        UiWidget var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.field_A != null) {
            this.field_A.pointerReleased(param0, this.field_m + param1, param2 + this.field_v, param3, param4, 0);
          }
          if (param5 != 0) {
            var8 = (UiWidget) null;
            discarded$1 = this.focusPreviousChild((UiWidget) null, 65);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("fc.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param5).append(')').toString());
        }
    }

    StringBuilder appendDebugTree(int param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginDebugTreeEntry(param3, param2, false, param1)) {
            this.appendDebugProperties(param2, param1, param3, 79);
            this.appendChildDebugTree(-113, param2, param1, param3);
          }
          if (param0 < 73) {
            this.getFocusedChild((byte) 74);
          }
          stackIn_6_0 = (StringBuilder) (param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("fc.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    void layoutChild(int param0) {
        if (null != this.field_A) {
          this.field_A.refreshLayout(0);
        }
        if (param0 != 80) {
          this.getFocusedChild((byte) 100);
        }
    }

    final void appendChildDebugTree(int param0, int param1, Hashtable param2, StringBuilder param3) {
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
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          discarded$3 = param3.append('\n');
          for (var5_int = 0; var5_int <= param1; var5_int++) {
            discarded$5 = param3.append(' ');
          }
          if (param0 > -16) {
            this.field_A = (UiWidget) null;
          }
          if (this.field_A == null) {
            discarded$4 = param3.append("null");
          } else {
            this.field_A.appendDebugTree(109, param2, 1 + param1, param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("fc.CB(").append(param0).append(',').append(param1).append(',');
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
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final boolean takeFocus(byte param0, UiWidget param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 0) {
            return false;
          }
          stackIn_7_0 = (this.field_A != null) && (this.field_A.takeFocus((byte) -100, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("fc.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean handleKey(int param0, UiWidget param1, int param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 274) {
            return true;
          }
          if (this.field_A != null &&
            this.field_A.isFocused(param0 - 9289) &&
            this.field_A.handleKey(274, param1, param2, param3)) {
            return true;
          }
          var5_int = param2;
          if (80 != var5_int) {
            return false;
          }
          if (!qh.field_m[81]) {
            stackIn_12_0 = this.focusNextChild(param1, 10);
          } else {
            stackIn_12_0 = this.focusPreviousChild(param1, param0 ^ -362);
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("fc.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int getMaximumRenderLayer(int param0) {
        if (param0 != 0) {
          return -103;
        }
        return this.field_A == null ? 0 : this.field_A.getMaximumRenderLayer(param0 + 0);
    }

    static {
    }
}
