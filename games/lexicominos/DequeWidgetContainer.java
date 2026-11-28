/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class DequeWidgetContainer extends UiWidget implements WidgetContainerMarker {
    IntrusiveDeque field_A;
    static int field_x;
    static fh field_z;
    static String field_y;

    final StringBuilder appendDebugTree(int param0, Hashtable param1, StringBuilder param2, int param3) {
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
          if (param3 != -15992) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.beginDebugTreeEntry(param3 + 23365, param2, param1, param0)) {
            this.appendDebugProperties(param2, 0, param0, param1);
            this.appendChildDebugTrees(param2, 124, param1, param0);
          }
          stackIn_7_0 = (StringBuilder) (param2);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("nb.TA(").append(param0).append(',');
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
          throw ld.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    UiWidget getFocusedChild(int param0) {
        ta var2;
        UiWidget var3;
        int var4;
        var4 = Lexicominos.field_L ? 1 : 0;
        var2 = new ta(this.field_A);
        if (param0 != -21374) {
          field_z = (fh) null;
        }
        var3 = (UiWidget) (var2.a(250));
        while (var3 != null) {
          if (var3.isFocused(18337)) {
            return var3;
          }
          var3 = (UiWidget) (var2.c(param0 + 21287));
        }
        return null;
    }

    final boolean focusNextChild(byte param0, UiWidget param1) {
        RuntimeException var3 = null;
        UiWidget var4 = null;
        ta var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        ta var8 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param0 != 119) {
            this.refreshChildLayouts(8);
          }
          if (this.field_A.isEmpty(95)) {
            return false;
          }
          var8 = new ta(this.field_A);
          var4 = (UiWidget) (var8.a(250));
          while (var4 != null) {
            if (var4.isFocused(18337)) {
              var5 = new ta(this.field_A);
              var5.a((IntrusiveNode) (var4), (byte) -127);
              var6 = (UiWidget) (var5.c(-123));
              while (var6 != null) {
                if (var6.takeFocus((byte) 44, param1)) {
                  return true;
                }
                var6 = (UiWidget) (var5.c(param0 - 228));
              }
            }
            var4 = (UiWidget) (var8.c(-54));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("nb.KB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final void blur(byte param0) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        ta var2 = new ta(this.field_A);
        if (param0 >= -35) {
          return;
        }
        UiWidget var3 = (UiWidget) (var2.a(250));
        while (var3 != null) {
          var3.blur((byte) -43);
          var3 = (UiWidget) (var2.c(-107));
        }
    }

    private final void refreshChildLayouts(int param0) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        if (param0 < 125) {
          this.blur((byte) 23);
        }
        ta var2 = new ta(this.field_A);
        UiWidget var3 = (UiWidget) (var2.a(250));
        while (var3 != null) {
          var3.refreshLayout(84);
          var3 = (UiWidget) (var2.c(-91));
        }
    }

    final int getMaximumRenderLayer(int param0) {
        int var5 = 0;
        int var6 = Lexicominos.field_L ? 1 : 0;
        if (param0 != 15508) {
          return -103;
        }
        int var2 = 0;
        ta var3 = new ta(this.field_A);
        UiWidget var4 = (UiWidget) (var3.a(250));
        while (var4 != null) {
          var5 = var4.getMaximumRenderLayer(15508);
          if (var5 > var2) {
            var2 = var5;
          }
          var4 = (UiWidget) (var3.c(-61));
        }
        return var2;
    }

    final static int a(int param0, int param1) {
        if (param0 >= -40) {
          return 43;
        }
        param1 = param1 & 8191;
        if (4096 <= param1) {
          return param1 >= 6144 ? v.field_w[param1 - 6144] : -v.field_w[6144 - param1];
        }
        return param1 < 2048 ? v.field_w[-param1 + 2048] : -v.field_w[param1 - 2048];
    }

    final boolean focusPreviousChild(int param0, UiWidget param1) {
        ta var3 = null;
        RuntimeException var3_ref = null;
        UiWidget var4 = null;
        ta var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          if (this.field_A.isEmpty(-114)) {
            return false;
          }
          var3 = new ta(this.field_A);
          var4 = (UiWidget) (var3.b(param0));
          while (var4 != null) {
            if (var4.isFocused(18337)) {
              var5 = new ta(this.field_A);
              var5.a(var4, 127);
              var6 = (UiWidget) (var5.e(param0 + 31842));
              while (var6 != null) {
                if (var6.takeFocus((byte) 44, param1)) {
                  return true;
                }
                var6 = (UiWidget) (var5.e(31842));
              }
            }
            var4 = (UiWidget) (var3.e(31842));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("nb.JB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final String getTooltipText(int param0) {
        ta var2;
        UiWidget var3;
        String var4;
        int var5;
        var5 = Lexicominos.field_L ? 1 : 0;
        var2 = new ta(this.field_A);
        if (param0 < 121) {
          field_y = (String) null;
        }
        var3 = (UiWidget) (var2.a(250));
        while (var3 != null) {
          var4 = var3.getTooltipText(125);
          if (var4 != null) {
            return var4;
          }
          var3 = (UiWidget) (var2.c(-93));
        }
        return null;
    }

    void drawWidget(byte param0, int param1, int param2, int param3) {
        int var7 = Lexicominos.field_L ? 1 : 0;
        if (param0 != -115) {
          return;
        }
        if (param3 == 0 &&
          this.field_i != null) {
          this.field_i.paintWidget(param1, param2, true, (UiWidget) (this), -3284);
        }
        ta var5 = new ta(this.field_A);
        UiWidget var6 = (UiWidget) (var5.b(0));
        while (var6 != null) {
          var6.drawWidget((byte) -115, this.field_o + param1, this.field_t + param2, param3);
          var6 = (UiWidget) (var5.e(31842));
        }
    }

    DequeWidgetContainer(int param0, int param1, int param2, int param3, WidgetRenderer param4) {
        super(param0, param1, param2, param3, param4, (WidgetEventListener) null);
        this.field_A = new IntrusiveDeque();
    }

    public static void d(boolean param0) {
        if (param0) {
          ResourceArchive var2 = (ResourceArchive) null;
          DequeWidgetContainer.a(82, 41, (byte) -49, (ResourceArchive) null);
        }
        field_y = null;
        field_z = null;
    }

    void updatePointer(byte param0, UiWidget param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        ta var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          super.updatePointer(param0, param1, param2, param3);
          var5 = new ta(this.field_A);
          var6 = (UiWidget) (var5.a(250));
          while (var6 != null) {
            if (var6.isLinked(false)) {
              var6.updatePointer((byte) -119, param1, param2 + this.field_o, param3 + this.field_t);
              var6 = (UiWidget) (var5.c(-115));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("nb.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean isFocused(int param0) {
        if (param0 != 18337) {
          return false;
        }
        return this.getFocusedChild(-21374) != null ? true : false;
    }

    boolean handleKey(char param0, int param1, UiWidget param2, byte param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        UiWidget var9 = null;
        ta var10 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          var10 = new ta(this.field_A);
          var9 = (UiWidget) (var10.a(250));
          var7 = -110 % ((-13 - param3) / 55);
          while (var9 != null) {
            if (var9.isLinked(false)) {
              if (var9.isFocused(18337) &&
                var9.handleKey(param0, param1, param2, (byte) -123)) {
                return true;
              }
              var9 = (UiWidget) (var10.c(-92));
              continue;
            }
            break;
          }
          var6 = param1;
          if (80 != var6) {
            return false;
          }
          if (wa.field_j[81]) {
            stackIn_14_0 = this.focusPreviousChild(0, param2);
          } else {
            stackIn_14_0 = this.focusNextChild((byte) 119, param2);
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("nb.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void appendChildDebugTrees(StringBuilder param0, int param1, Hashtable param2, int param3) {
        StringBuilder discarded$3 = null;
        int var7 = 0;
        StringBuilder discarded$4 = null;
        ta var5 = null;
        UiWidget var6 = null;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          var5 = new ta(this.field_A);
          if (param1 < 112) {
            return;
          }
          var6 = (UiWidget) (var5.a(250));
          while (var6 != null) {
            discarded$3 = param0.append('\n');
            for (var7 = 0; var7 <= param3; var7++) {
              discarded$4 = param0.append(' ');
            }
            var6.appendDebugTree(1 + param3, param2, param0, -15992);
            var6 = (UiWidget) (var5.c(-74));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("nb.SA(");
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
          throw ld.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean pointerPressed(int param0, int param1, UiWidget param2, int param3, int param4, int param5, int param6) {
        ta var8 = null;
        RuntimeException var8_ref = null;
        UiWidget var9 = null;
        int var10 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          var8 = new ta(this.field_A);
          var9 = (UiWidget) (var8.a(250));
          while (var9 != null) {
            if (var9.isLinked(false)) {
              if (var9.pointerPressed(param0 + 0, param1, param2, param3, this.field_o + param4, param5 + this.field_t, param6)) {
                return true;
              }
              var9 = (UiWidget) (var8.c(-122));
              continue;
            }
            break;
          }
          if (param0 == -4808) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_16_0 = var8_ref;
          stackIn_16_1 = new StringBuilder().append("nb.VA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean takeFocus(byte param0, UiWidget param1) {
        ta var3 = null;
        RuntimeException var3_ref = null;
        UiWidget var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          var3 = new ta(this.field_A);
          if (param0 != 44) {
            field_x = -19;
          }
          var4 = (UiWidget) (var3.a(param0 ^ 214));
          while (var4 != null) {
            if (var4.takeFocus((byte) 44, param1)) {
              return true;
            }
            var4 = (UiWidget) (var3.c(-63));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("nb.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, byte param2, ResourceArchive param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        byte[] var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = param3.getFile(param0, -27493, param1);
          var4 = var6;
          if (var6 == null) {
            return false;
          }
          gf.a((byte) 106, var6);
          var5 = 105 % ((69 - param2) / 55);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("nb.UA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void setBounds(int param0, int param1, boolean param2, int param3, int param4) {
        super.setBounds(param0, param1, param2, param3, param4);
        this.refreshChildLayouts(126);
    }

    final void addChild(byte param0, UiWidget param1) {
        try {
          int var3_int = 34 % ((-8 - param0) / 56);
          this.field_A.addLast(116, param1);
        } catch (RuntimeException runtimeException) {
          throw ld.wrapClientException((Throwable) ((Object) runtimeException), "nb.CB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean handleWheel(int param0, int param1, int param2, int param3, UiWidget param4, int param5, int param6) {
        ta var8 = null;
        RuntimeException var8_ref = null;
        UiWidget var9 = null;
        int var10 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          var8 = new ta(this.field_A);
          if (param5 != -29771) {
            return true;
          }
          var9 = (UiWidget) (var8.a(param5 + 30021));
          while (var9 != null) {
            if (var9.isLinked(false)) {
              if (var9.isFocused(18337) &&
                var9.handleWheel(param0, param1, param2, param3, param4, -29771, param6)) {
                return true;
              }
              var9 = (UiWidget) (var8.c(-84));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_16_0 = var8_ref;
          stackIn_16_1 = new StringBuilder().append("nb.FB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void pointerReleased(UiWidget param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        ta var7 = null;
        UiWidget var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param3 != 0) {
            field_x = -28;
          }
          var7 = new ta(this.field_A);
          var8 = (UiWidget) (var7.a(250));
          while (var8 != null) {
            if (var8.isLinked(false)) {
              var8.pointerReleased(param0, param1, this.field_o + param2, 0, this.field_t + param4, param5);
              var8 = (UiWidget) (var7.c(-85));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("nb.BB(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_y = "Login: ";
    }
}
