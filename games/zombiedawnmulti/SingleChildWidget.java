/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class SingleChildWidget extends UiWidget implements ChildWidgetOwner {
    UiWidget field_B;
    static IndexedSprite field_C;
    static String field_D;

    final void appendChildDiagnostics(Hashtable param0, boolean param1, StringBuilder param2, int param3) {
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
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (!param1) {
            this.findFocusTarget(-102);
          }
          discarded$4 = param2.append('\n');
          for (var5_int = 0; var5_int <= param3; var5_int++) {
            discarded$6 = param2.append(' ');
          }
          if (null == this.field_B) {
            discarded$5 = param2.append("null");
          } else {
            this.field_B.appendWidgetDiagnostics(7, param0, 1 + param3, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("rg.DA(");
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
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    StringBuilder appendWidgetDiagnostics(int param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginWidgetDiagnosticVisit(param1, 9, param3, param2)) {
            this.appendWidgetDiagnosticProperties(param2, param3, (byte) 26, param1);
            this.appendChildDiagnostics(param1, true, param3, param2);
          }
          if (param0 != 7) {
            this.hasKeyboardFocus(-4);
          }
          stackIn_5_0 = (StringBuilder) (param3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("rg.GA(").append(param0).append(',');
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
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    void refreshChildLayout(int param0) {
        if (param0 != -18384) {
          this.field_B = (UiWidget) null;
        }
        if (null != this.field_B) {
          this.field_B.refreshLayout(-1);
        }
    }

    String getHoverText(byte param0) {
        String var4 = null;
        String var2 = super.getHoverText((byte) 117);
        int var3 = 6 % ((53 - param0) / 57);
        if (this.field_B != null) {
          var4 = this.field_B.getHoverText((byte) 110);
          if (var4 != null) {
            return var4;
          }
        }
        return var2;
    }

    final int getTopLayer(byte param0) {
        if (param0 != 44) {
          return -111;
        }
        return null != this.field_B ? this.field_B.getTopLayer((byte) 44) : 0;
    }

    void handlePointerRelease(int param0, UiWidget param1, int param2, int param3, boolean param4, int param5) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (null != this.field_B) {
            this.field_B.handlePointerRelease(param0, param1, this.field_i + param2, param3, true, this.field_y + param5);
          }
          if (!param4) {
            field_C = (IndexedSprite) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("rg.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final boolean handlePointerPress(UiWidget param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -124) {
            this.field_B = (UiWidget) null;
          }
          stackIn_7_0 = (this.field_B != null) && (!this.field_B.hasKeyboardFocus(125)) && (this.field_B.requestKeyboardFocus(param0, 0));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("rg.W(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    SingleChildWidget(int param0, int param1, int param2, int param3, WidgetPainter param4, WidgetListener param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final boolean requestKeyboardFocus(byte param0, int param1, int param2, int param3, int param4, int param5, UiWidget param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = 66 / ((param0 - 48) / 37);
          stackIn_5_0 = (null != this.field_B) && (this.field_B.hasKeyboardFocus(125)) && (this.field_B.requestKeyboardFocus((byte) -125, param1, param2, param3, param4, param5, param6));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("rg.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    UiWidget findFocusTarget(int param0) {
        if (param0 != -1963) {
          field_C = (IndexedSprite) null;
        }
        UiWidget var2 = this.field_B;
        if (var2 == null) {
          return null;
        }
        if (!var2.hasKeyboardFocus(param0 ^ -2005)) {
          return null;
        }
        return var2;
    }

    public static void releaseStatics(byte param0) {
        if (param0 != -39) {
          SingleChildWidget.releaseStatics((byte) 21);
        }
        field_D = null;
        field_C = null;
    }

    final void clearKeyboardFocus(byte param0) {
        if (param0 != 32) {
          return;
        }
        if (null != this.field_B) {
          this.field_B.clearKeyboardFocus((byte) 32);
        }
    }

    void updatePointerState(int param0, UiWidget param1, int param2, int param3) {
        try {
          super.updatePointerState(param0, param1, param2, param3);
          if (this.field_B != null) {
            this.field_B.updatePointerState(-5407, param1, this.field_y + param2, this.field_i + param3);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "rg.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void setWidgetBounds(int param0, int param1, int param2, int param3, int param4) {
        super.setWidgetBounds(param0, param1, param2, param3, param4);
        this.refreshChildLayout(param2 ^ -14052);
    }

    final boolean handleKeyInput(int param0, char param1, UiWidget param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -6208) {
            field_C = (IndexedSprite) null;
          }
          if (this.field_B != null &&
            this.field_B.hasKeyboardFocus(127) &&
            this.field_B.handleKeyInput(param0, param1, param2, -6208)) {
            return true;
          }
          var5_int = param0;
          if (var5_int != 80) {
            return false;
          }
          if (PulseEffect.field_m[81]) {
            stackIn_12_0 = this.focusUnfocusedChild(-81, param2);
          } else {
            stackIn_12_0 = this.handlePointerPress(param2, (byte) -125);
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("rg.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean focusUnfocusedChild(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -81) {
            this.hasKeyboardFocus(-108);
          }
          stackIn_7_0 = (null != this.field_B) && (!this.field_B.hasKeyboardFocus(127)) && (this.field_B.requestKeyboardFocus(param1, 0));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("rg.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    void renderWidget(int param0, int param1, int param2, int param3) {
        if (param0 != -2) {
          this.getTopLayer((byte) 0);
        }
        if (param2 == 0 &&
          null != this.painter) {
          this.painter.paintWidget(true, param1, -15112, param3, (UiWidget) (this));
        }
        if (null != this.field_B) {
          this.field_B.renderWidget(param0 ^ 0, this.field_i + param1, param2, this.field_y + param3);
        }
    }

    boolean handlePointerPress(int param0, int param1, int param2, UiWidget param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != -24) {
            return false;
          }
          stackIn_7_0 = (null != this.field_B) && (this.field_B.handlePointerPress(param0, param1, param2, param3, -24, param5 + this.field_y, this.field_i + param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("rg.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean hasKeyboardFocus(int param0) {
        if (param0 < 123) {
          field_D = (String) null;
        }
        return null != this.findFocusTarget(-1963) ? true : false;
    }

    final static UiTheme getDefaultTheme(int param0) {
        if (param0 != -18799) {
          return (UiTheme) null;
        }
        if (null == ArchiveLoadSequence.field_g) {
          ArchiveLoadSequence.field_g = new UiTheme();
          ArchiveLoadSequence.field_g.initializePainters(125269879, FontPaletteHelpers.field_h);
          ArchiveLoadSequence.field_g.field_d = 2763306;
          ArchiveLoadSequence.field_g.field_p = 14;
          ArchiveLoadSequence.field_g.field_e = 0;
          ArchiveLoadSequence.field_g.field_c = 5;
          ArchiveLoadSequence.field_g.field_l = 6;
          ArchiveLoadSequence.field_g.field_h = DisplayNamePanel.field_H;
          ArchiveLoadSequence.field_g.field_b = 7697781;
          ArchiveLoadSequence.field_g.field_m = 4;
        }
        return ArchiveLoadSequence.field_g;
    }

    final boolean requestKeyboardFocus(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            return true;
          }
          stackIn_7_0 = (null != this.field_B) && (this.field_B.requestKeyboardFocus(param0, 0));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("rg.S(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_D = "Connecting to<br>friend server...";
    }
}
