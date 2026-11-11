/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class WidgetContainer extends UiWidget implements WidgetParent {
    static String field_v;
    IntrusiveDeque children;

    final boolean focusNextChild(UiWidget param0, byte param1) {
        RuntimeException var3 = null;
        UiWidget var4 = null;
        IntrusiveDequeCursor var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        UiWidget var8 = null;
        IntrusiveDequeCursor var9 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.children.isEmpty((byte) 14)) {
            return false;
          }
          var9 = new IntrusiveDequeCursor(this.children);
          if (param1 != -9) {
            var8 = (UiWidget) null;
            this.focusPreviousChild((UiWidget) null, (byte) 90);
          }
          var4 = (UiWidget) (var9.first(true));
          while (var4 != null) {
            if (var4.hasKeyboardFocus((byte) -34)) {
              var5 = new IntrusiveDequeCursor(this.children);
              var5.firstFrom(0, var4);
              var6 = (UiWidget) (var5.next(-1));
              while (var6 != null) {
                if (!var6.requestKeyboardFocus(param0, false)) {
                  var6 = (UiWidget) (var5.next(param1 ^ 8));
                  continue;
                }
                return true;
              }
            }
            var4 = (UiWidget) (var9.next(-1));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("b.VA(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    void clearKeyboardFocus(byte param0) {
        int var5 = TombRacer.field_G ? 1 : 0;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.children);
        int var4 = -96 % ((param0 + 38) / 60);
        UiWidget var3 = (UiWidget) (var2.first(true));
        while (var3 != null) {
          var3.clearKeyboardFocus((byte) -115);
          var3 = (UiWidget) (var2.next(-1));
        }
    }

    final boolean focusPreviousChild(UiWidget param0, byte param1) {
        RuntimeException var3 = null;
        UiWidget var4 = null;
        IntrusiveDequeCursor var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        UiWidget var8 = null;
        IntrusiveDequeCursor var9 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.children.isEmpty((byte) 14)) {
            return false;
          }
          if (param1 > -45) {
            var8 = (UiWidget) null;
            this.handlePointerRelease((byte) 112, (UiWidget) null, 60, 11, -7, -44);
          }
          var9 = new IntrusiveDequeCursor(this.children);
          var4 = (UiWidget) (var9.last((byte) 99));
          while (var4 != null) {
            if (var4.hasKeyboardFocus((byte) -34)) {
              var5 = new IntrusiveDequeCursor(this.children);
              var5.startBackwardAt(var4, (byte) -11);
              var6 = (UiWidget) (var5.previous(60));
              while (var6 != null) {
                if (var6.requestKeyboardFocus(param0, false)) {
                  return true;
                }
                var6 = (UiWidget) (var5.previous(33));
              }
            }
            var4 = (UiWidget) (var9.previous(62));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("b.AB(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_v = null;
        int var1 = -18 / ((param0 - 38) / 48);
    }

    final static byte[] copyByteRange(int param0, int param1, int param2, byte[] param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new byte[param0];
          var4 = var5;
          ArrayUtils.copy(param3, param2, var5, param1, param0);
          stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("b.CB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final StringBuilder appendDiagnostics(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginDiagnosticVisit((byte) -115, param0, param1, param2)) {
            this.appendDiagnosticProperties(1, param2, param1, param0);
            this.appendDebugChildren(param0, param1, param2, 23241);
          }
          if (param3 != 0) {
            field_v = (String) null;
          }
          stackIn_6_0 = (StringBuilder) (param2);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("b.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    void renderLayer(int param0, int param1, int param2, int param3) {
        int var7 = TombRacer.field_G ? 1 : 0;
        if (param3 == 0 &&
          null != this.field_r) {
          this.field_r.paintWidget((UiWidget) (this), param0, param2 + 16777215, param1, true);
        }
        IntrusiveDequeCursor var5 = new IntrusiveDequeCursor(this.children);
        if (param2 != 0) {
          return;
        }
        UiWidget var6 = (UiWidget) (var5.last((byte) 120));
        while (var6 != null) {
          var6.renderLayer(param0 + this.field_i, this.field_n + param1, 0, param3);
          var6 = (UiWidget) (var5.previous(param2 ^ 46));
        }
    }

    final static lu a(String param0, int param1, String param2, boolean param3, long param4) {
        RuntimeException var6 = null;
        hda stackIn_6_0 = null;
        wc stackIn_8_0 = null;
        tc stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 == (long)param1 &&
            param2 != null) {
            stackIn_8_0 = new wc(param2, param0);
            return (lu) ((Object) stackIn_8_0);
          }
          if (param3) {
            stackIn_6_0 = new hda(param4, param0);
            return (lu) ((Object) stackIn_6_0);
          }
          stackIn_10_0 = new tc(param4, param0);
          return (lu) ((Object) stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("b.DB(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    String getHoverText(byte param0) {
        String var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.children);
        UiWidget var6 = (UiWidget) (var2.first(true));
        while (var6 != null) {
          var4 = var6.getHoverText((byte) 127);
          if (var4 != null) {
            return var4;
          }
          var6 = (UiWidget) (var2.next(-1));
        }
        int var3 = 127 % ((param0 + 58) / 60);
        return null;
    }

    final int getTopLayer(boolean param0) {
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        int var2 = 0;
        if (param0) {
          UiWidget var7 = (UiWidget) null;
          this.addChild((UiWidget) null, -99);
        }
        IntrusiveDequeCursor var3 = new IntrusiveDequeCursor(this.children);
        UiWidget var4 = (UiWidget) (var3.first(true));
        while (var4 != null) {
          var5 = var4.getTopLayer(false);
          if (var5 > var2) {
            var2 = var5;
          }
          var4 = (UiWidget) (var3.next(-1));
        }
        return var2;
    }

    boolean handlePointerPress(int param0, int param1, int param2, int param3, int param4, UiWidget param5, int param6) {
        IntrusiveDequeCursor var8 = null;
        RuntimeException var8_ref = null;
        UiWidget var9 = null;
        int var10 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          var8 = new IntrusiveDequeCursor(this.children);
          if (param0 <= 70) {
            return false;
          }
          var9 = (UiWidget) (var8.first(true));
          while (var9 != null) {
            if (var9.isLinked((byte) -114)) {
              if (!var9.handlePointerPress(121, param1 + this.field_i, this.field_n + param2, param3, param4, param5, param6)) {
                var9 = (UiWidget) (var8.next(-1));
                continue;
              }
              return true;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_15_0 = var8_ref;
          stackIn_15_1 = new StringBuilder().append("b.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param6).append(')').toString());
        }
    }

    boolean hasKeyboardFocus(byte param0) {
        if (param0 != -34) {
          return true;
        }
        return this.getFocusedChild((byte) 52) != null ? true : false;
    }

    UiWidget getFocusedChild(byte param0) {
        IntrusiveDequeCursor var2;
        UiWidget var3;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        var2 = new IntrusiveDequeCursor(this.children);
        if (param0 != 52) {
          field_v = (String) null;
        }
        var3 = (UiWidget) (var2.first(true));
        while (var3 != null) {
          if (var3.hasKeyboardFocus((byte) -34)) {
            return var3;
          }
          var3 = (UiWidget) (var2.next(-1));
        }
        return null;
    }

    final void handlePointerRelease(byte param0, UiWidget param1, int param2, int param3, int param4, int param5) {
        IntrusiveDequeCursor var7 = null;
        UiWidget var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          var7 = new IntrusiveDequeCursor(this.children);
          var8 = (UiWidget) (var7.first(true));
          while (var8 != null) {
            if (var8.isLinked((byte) -107)) {
              var8.handlePointerRelease((byte) 59, param1, param2, this.field_i + param3, param4 + this.field_n, param5);
              var8 = (UiWidget) (var7.next(-1));
              continue;
            }
            break;
          }
          if (param0 != 59) {
            this.getFocusedChild((byte) 119);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_10_0 = var7_ref;
          stackIn_10_1 = new StringBuilder().append("b.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    boolean requestKeyboardFocus(UiWidget param0, boolean param1) {
        IntrusiveDequeCursor var3 = null;
        RuntimeException var3_ref = null;
        UiWidget var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          var3 = new IntrusiveDequeCursor(this.children);
          if (param1) {
            return false;
          }
          var4 = (UiWidget) (var3.first(true));
          while (true) {
            if (var4 == null) {
              return false;
            }
            if (!var4.requestKeyboardFocus(param0, false)) {
              var4 = (UiWidget) (var3.next(-1));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("b.S(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int highestOneBit(int param0, byte param1) {
        int var2 = param0 >>> 1;
        var2 = var2 | var2 >>> 1;
        var2 = var2 | var2 >>> 2;
        var2 = var2 | var2 >>> 4;
        var2 = var2 | var2 >>> 8;
        int var3 = 126 / ((param1 + 24) / 60);
        var2 = var2 | var2 >>> 16;
        return ~var2 & param0;
    }

    WidgetContainer(int param0, int param1, int param2, int param3, WidgetPainter param4) {
        super(param0, param1, param2, param3, param4, (WidgetListener) null);
        this.children = new IntrusiveDeque();
    }

    final boolean handleMouseWheel(int param0, int param1, int param2, int param3, UiWidget param4, int param5, int param6) {
        IntrusiveDequeCursor var8 = null;
        RuntimeException var8_ref = null;
        UiWidget var9 = null;
        int var10 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          var8 = new IntrusiveDequeCursor(this.children);
          if (param6 != -1) {
            field_v = (String) null;
          }
          var9 = (UiWidget) (var8.first(true));
          while (var9 != null) {
            if (var9.isLinked((byte) 30)) {
              if (var9.hasKeyboardFocus((byte) -34) &&
                var9.handleMouseWheel(param0, param1, param2, param3, param4, param5, -1)) {
                return true;
              }
              var9 = (UiWidget) (var8.next(-1));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_15_0 = var8_ref;
          stackIn_15_1 = new StringBuilder().append("b.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    boolean handleKeyInput(char param0, UiWidget param1, int param2, boolean param3) {
        IntrusiveDequeCursor var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        UiWidget var8 = null;
        boolean stackIn_16_0 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          var5 = new IntrusiveDequeCursor(this.children);
          if (!param3) {
            return true;
          }
          var8 = (UiWidget) (var5.first(param3));
          while (var8 != null) {
            if (var8.isLinked((byte) 35)) {
              if (var8.hasKeyboardFocus((byte) -34) &&
                var8.handleKeyInput(param0, param1, param2, true)) {
                return true;
              }
              var8 = (UiWidget) (var5.next(-1));
              continue;
            }
            break;
          }
          var6 = param2;
          if (var6 != 80) {
            return false;
          }
          if (VerticalScrollbar.field_tb[81]) {
            stackIn_16_0 = this.focusPreviousChild(param1, (byte) -124);
          } else {
            stackIn_16_0 = this.focusNextChild(param1, (byte) -9);
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_21_0 = var5_ref;
          stackIn_21_1 = new StringBuilder().append("b.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void refreshChildLayouts(int param0) {
        int var4 = TombRacer.field_G ? 1 : 0;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.children);
        UiWidget var3 = (UiWidget) (var2.first(true));
        while (var3 != null) {
          var3.refreshLayout((byte) -121);
          var3 = (UiWidget) (var2.next(-1));
        }
        if (param0 <= 110) {
          field_v = (String) null;
        }
    }

    final void addChild(UiWidget param0, int param1) {
        try {
          this.children.addLast((byte) -67, param0);
          if (param1 != -1) {
            this.refreshChildLayouts(64);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "b.UA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void setBounds(byte param0, int param1, int param2, int param3, int param4) {
        super.setBounds(param0, param1, param2, param3, param4);
        this.refreshChildLayouts(param0 ^ -112);
    }

    private final void appendDebugChildren(int param0, Hashtable param1, StringBuilder param2, int param3) {
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
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          var5 = new IntrusiveDequeCursor(this.children);
          if (param3 != 23241) {
            this.children = (IntrusiveDeque) null;
          }
          var6 = (UiWidget) (var5.first(true));
          while (var6 != null) {
            discarded$3 = param2.append('\n');
            for (var7 = 0; param0 >= var7; var7++) {
              discarded$4 = param2.append(' ');
            }
            var6.appendDiagnostics(param0 + 1, param1, param2, 0);
            var6 = (UiWidget) (var5.next(-1));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("b.EB(").append(param0).append(',');
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
          throw tba.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    void updatePointerState(int param0, int param1, UiWidget param2, int param3) {
        RuntimeException runtimeException = null;
        IntrusiveDequeCursor var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          super.updatePointerState(param0, param1, param2, param3);
          var5 = new IntrusiveDequeCursor(this.children);
          var6 = (UiWidget) (var5.first(true));
          while (var6 != null) {
            if (var6.isLinked((byte) 70)) {
              var6.updatePointerState(this.field_i + param0, 2097152, param2, param3 + this.field_n);
              var6 = (UiWidget) (var5.next(-1));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("b.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_v = "Rankings";
    }
}
