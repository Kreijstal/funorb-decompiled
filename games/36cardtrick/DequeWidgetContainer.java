/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class DequeWidgetContainer extends UiWidget implements WidgetContainerMarker {
    static String field_B;
    static RgbSprite[] field_C;
    static int[][] field_y;
    IntrusiveDeque field_z;
    static int field_A;

    void drawWidget(int param0, int param1, int param2, int param3) {
        int var7 = Main.field_T;
        if (~param3 == param2 &&
          null != this.field_v) {
          this.field_v.paintWidget(param0, (UiWidget) (this), 11447, param1, true);
        }
        qd var5 = new qd(this.field_z);
        UiWidget var6 = (UiWidget) (var5.c((byte) -13));
        while (var6 != null) {
          var6.drawWidget(param0 + this.field_o, this.field_i + param1, -1, param3);
          var6 = (UiWidget) (var5.a((byte) 101));
        }
    }

    final static void k(int param0) {
        if (!eh.d(19314)) {
          return;
        }
        AccountRequestState.a(param0, (byte) 122, false);
    }

    final void setBounds(int param0, int param1, int param2, int param3, boolean param4) {
        super.setBounds(param0, param1, param2, param3, param4);
        this.refreshChildLayouts(1);
    }

    UiWidget getFocusedChild(int param0) {
        qd var2;
        UiWidget var3;
        int var4;
        var4 = Main.field_T;
        var2 = new qd(this.field_z);
        if (param0 != -1) {
          this.field_z = (IntrusiveDeque) null;
        }
        var3 = (UiWidget) (var2.b((byte) -33));
        while (var3 != null) {
          if (var3.isFocused(param0 ^ -122)) {
            return var3;
          }
          var3 = (UiWidget) (var2.a(28869));
        }
        return null;
    }

    final void addChild(UiWidget param0, byte param1) {
        try {
          this.field_z.addLast(param0, param1 ^ 27284);
          if (param1 != 118) {
            field_y = (int[][]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "g.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean isFocused(int param0) {
        if (param0 < 44) {
          field_C = (RgbSprite[]) null;
        }
        return null != this.getFocusedChild(-1) ? true : false;
    }

    void updatePointer(int param0, int param1, UiWidget param2, int param3) {
        RuntimeException runtimeException = null;
        qd var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Main.field_T;
        try {
          super.updatePointer(param0, param1, param2, param3 ^ 0);
          var5 = new qd(this.field_z);
          if (param3 != 3) {
            this.getMaximumRenderLayer(-85);
          }
          var6 = (UiWidget) (var5.b((byte) -33));
          while (var6 != null) {
            if (var6.isLinked(55)) {
              var6.updatePointer(this.field_i + param0, param1 + this.field_o, param2, param3 + 0);
              var6 = (UiWidget) (var5.a(28869));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("g.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean takeFocus(int param0, UiWidget param1) {
        qd var3 = null;
        RuntimeException var3_ref = null;
        UiWidget var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Main.field_T;
        try {
          var3 = new qd(this.field_z);
          if (param0 <= 71) {
            this.field_z = (IntrusiveDeque) null;
          }
          var4 = (UiWidget) (var3.b((byte) -33));
          while (var4 != null) {
            if (var4.takeFocus(90, param1)) {
              return true;
            }
            var4 = (UiWidget) (var3.a(28869));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("g.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void clearStaticReferences(boolean param0) {
        field_C = null;
        field_y = (int[][]) null;
        field_B = null;
        if (!param0) {
          DequeWidgetContainer.clearStaticReferences(true);
        }
    }

    private final void refreshChildLayouts(int param0) {
        int var4 = Main.field_T;
        qd var2 = new qd(this.field_z);
        if (param0 != 1) {
          this.setBounds(43, -101, -28, -27, false);
        }
        UiWidget var3 = (UiWidget) (var2.b((byte) -33));
        while (var3 != null) {
          var3.refreshLayout(param0 ^ 26946);
          var3 = (UiWidget) (var2.a(param0 ^ 28868));
        }
    }

    private final void appendChildDebugTrees(Hashtable param0, int param1, StringBuilder param2, int param3) {
        StringBuilder discarded$3 = null;
        int var7 = 0;
        StringBuilder discarded$4 = null;
        qd var5 = null;
        UiWidget var6 = null;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Main.field_T;
        try {
          var5 = new qd(this.field_z);
          if (param1 >= -46) {
            this.getMaximumRenderLayer(-89);
          }
          var6 = (UiWidget) (var5.b((byte) -33));
          while (var6 != null) {
            discarded$3 = param2.append('\n');
            for (var7 = 0; param3 >= var7; var7++) {
              discarded$4 = param2.append(' ');
            }
            var6.appendDebugTree(param0, false, 1 + param3, param2);
            var6 = (UiWidget) (var5.a(28869));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("g.AB(");
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
          throw ma.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final void pointerReleased(boolean param0, UiWidget param1, int param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        qd var7 = null;
        UiWidget var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Main.field_T;
        try {
          var7 = new qd(this.field_z);
          if (param0) {
            this.field_z = (IntrusiveDeque) null;
          }
          var8 = (UiWidget) (var7.b((byte) -33));
          while (var8 != null) {
            if (var8.isLinked(-100)) {
              var8.pointerReleased(param0, param1, param2, this.field_o + param3, this.field_i + param4, param5);
              var8 = (UiWidget) (var7.a(28869));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("g.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final boolean focusNextChild(UiWidget param0, byte param1) {
        RuntimeException var3 = null;
        UiWidget var4 = null;
        qd var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        qd var8 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Main.field_T;
        try {
          if (this.field_z.isEmpty(2220)) {
            return false;
          }
          if (param1 != -28) {
            field_y = (int[][]) null;
          }
          var8 = new qd(this.field_z);
          var4 = (UiWidget) (var8.b((byte) -33));
          while (var4 != null) {
            if (var4.isFocused(param1 + 142)) {
              var5 = new qd(this.field_z);
              var5.a(25755, var4);
              var6 = (UiWidget) (var5.a(28869));
              while (var6 != null) {
                if (var6.takeFocus(89, param0)) {
                  return true;
                }
                var6 = (UiWidget) (var5.a(28869));
              }
            }
            var4 = (UiWidget) (var8.a(28869));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("g.PA(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean handleWheel(int param0, int param1, int param2, int param3, int param4, int param5, UiWidget param6) {
        RuntimeException var8 = null;
        UiWidget var9 = null;
        int var10 = 0;
        qd var11 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Main.field_T;
        try {
          if (param5 != -1) {
            field_A = 26;
          }
          var11 = new qd(this.field_z);
          var9 = (UiWidget) (var11.b((byte) -33));
          while (var9 != null) {
            if (var9.isLinked(103)) {
              if (var9.isFocused(param5 + 70) &&
                var9.handleWheel(param0, param1, param2, param3, param4, param5 ^ 0, param6)) {
                return true;
              }
              var9 = (UiWidget) (var11.a(param5 ^ -28870));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("g.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final boolean focusPreviousChild(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        UiWidget var4 = null;
        qd var5_ref_qd = null;
        int var5 = 0;
        UiWidget var6 = null;
        int var7 = 0;
        qd var8 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Main.field_T;
        try {
          if (this.field_z.isEmpty(2220)) {
            return false;
          }
          var8 = new qd(this.field_z);
          var4 = (UiWidget) (var8.c((byte) -13));
          while (var4 != null) {
            if (var4.isFocused(72)) {
              var5_ref_qd = new qd(this.field_z);
              var5_ref_qd.a((byte) -8, (IntrusiveNode) (var4));
              var6 = (UiWidget) (var5_ref_qd.a((byte) 79));
              while (var6 != null) {
                if (!var6.takeFocus(97, param1)) {
                  var6 = (UiWidget) (var5_ref_qd.a((byte) 99));
                  continue;
                }
                return true;
              }
            }
            var4 = (UiWidget) (var8.a((byte) 80));
          }
          var5 = 15 % ((param0 - 29) / 60);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("g.SA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    boolean handleKey(char param0, byte param1, int param2, UiWidget param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        UiWidget var8 = null;
        qd var9 = null;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Main.field_T;
        try {
          if (param1 > -99) {
            return false;
          }
          var9 = new qd(this.field_z);
          var8 = (UiWidget) (var9.b((byte) -33));
          while (var8 != null) {
            if (var8.isLinked(111)) {
              if (var8.isFocused(109) &&
                var8.handleKey(param0, (byte) -123, param2, param3)) {
                return true;
              }
              var8 = (UiWidget) (var9.a(28869));
              continue;
            }
            break;
          }
          var6 = param2;
          if (var6 != 80) {
            return false;
          }
          if (!GzipInflater.field_c[81]) {
            stackIn_17_0 = this.focusNextChild(param3, (byte) -28);
          } else {
            stackIn_17_0 = this.focusPreviousChild(-85, param3);
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("g.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final String getTooltipText(byte param0) {
        qd var2;
        UiWidget var3;
        String var4;
        int var5;
        var5 = Main.field_T;
        var2 = new qd(this.field_z);
        var3 = (UiWidget) (var2.b((byte) -33));
        if (param0 != -79) {
          return (String) null;
        }
        while (var3 != null) {
          var4 = var3.getTooltipText((byte) -79);
          if (var4 != null) {
            return var4;
          }
          var3 = (UiWidget) (var2.a(28869));
        }
        return null;
    }

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param2 != -1) {
            return true;
          }
          param0 = BoundedRandomAccessFile.a('_', 58, param0, "");
          var3 = gi.a(100, param0);
          stackIn_8_0 = (param1.indexOf(param0) != -1) || (param1.indexOf(var3) != -1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("g.WA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean pointerPressed(int param0, int param1, int param2, int param3, UiWidget param4, int param5, int param6) {
        RuntimeException var8 = null;
        UiWidget var9 = null;
        int var10 = 0;
        UiWidget var11 = null;
        qd var12 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Main.field_T;
        try {
          if (param3 > -14) {
            var11 = (UiWidget) null;
            this.handleWheel(95, -63, -9, 109, -30, 36, (UiWidget) null);
          }
          var12 = new qd(this.field_z);
          var9 = (UiWidget) (var12.b((byte) -33));
          while (var9 != null) {
            if (var9.isLinked(24)) {
              if (!var9.pointerPressed(this.field_o + param0, this.field_i + param1, param2, -24, param4, param5, param6)) {
                var9 = (UiWidget) (var12.a(28869));
                continue;
              }
              return true;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("g.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    DequeWidgetContainer(int param0, int param1, int param2, int param3, WidgetRenderer param4) {
        super(param0, param1, param2, param3, param4, (WidgetEventListener) null);
        this.field_z = new IntrusiveDeque();
    }

    final StringBuilder appendDebugTree(Hashtable param0, boolean param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginDebugTreeEntry(param3, param2, param1, param0)) {
            this.appendDebugProperties(param0, (byte) -16, param3, param2);
            this.appendChildDebugTrees(param0, -93, param3, param2);
          }
          stackIn_3_0 = (StringBuilder) (param3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("g.V(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static boolean j(int param0) {
        String var2;
        boolean stackIn_6_0 = false;
        if (param0 != 7) {
          var2 = (String) null;
          DequeWidgetContainer.a((String) null, (String) null, 67);
        }
        stackIn_6_0 = (null != cb.field_j) && (ra.field_b == ad.field_q);
        return stackIn_6_0;
    }

    final int getMaximumRenderLayer(int param0) {
        int var5 = 0;
        int var6 = Main.field_T;
        if (param0 != -1) {
          return -49;
        }
        int var2 = 0;
        qd var3 = new qd(this.field_z);
        UiWidget var4 = (UiWidget) (var3.b((byte) -33));
        while (var4 != null) {
          var5 = var4.getMaximumRenderLayer(param0 ^ 0);
          if (var2 < var5) {
            var2 = var5;
          }
          var4 = (UiWidget) (var3.a(28869));
        }
        return var2;
    }

    final void blur(byte param0) {
        int var4 = Main.field_T;
        qd var2 = new qd(this.field_z);
        UiWidget var3 = (UiWidget) (var2.b((byte) -33));
        if (param0 < 27) {
          DequeWidgetContainer.a(-76);
        }
        while (var3 != null) {
          var3.blur((byte) 105);
          var3 = (UiWidget) (var2.a(28869));
        }
    }

    final static void a(int param0) {
        int var1 = -50 % ((param0 - 41) / 51);
        if (mf.field_i < 70) {
          wf.a(mf.field_i + 10, -78);
        } else {
          wf.a(80, -114);
        }
    }

    static {
        field_B = "Names cannot contain consecutive spaces";
        field_y = new int[][]{new int[]{5, 6, 7, 8, 9, 10, 11}, new int[]{0, 1, 2, 3, 4, 12, 13, 14}};
    }
}
