/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class WidgetContainer extends UiWidget implements CompositeWidgetMarker {
    static AccountConnectionPhase WAIT_LOGIN_ERROR;
    static int[] field_x;
    IntrusiveDeque children;

    private final void a(StringBuilder param0, byte param1, Hashtable param2, int param3) {
        StringBuilder discarded$3 = null;
        int var7 = 0;
        StringBuilder discarded$4 = null;
        IntrusiveDequeCursor var5 = null;
        UiWidget var6 = null;
        int var8 = 0;
        UiWidget var9 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5 = new IntrusiveDequeCursor(this.children);
          var6 = (UiWidget) (var5.first((byte) -80));
          if (param1 >= -30) {
            var9 = (UiWidget) null;
            this.requestFocus((UiWidget) null, (byte) -17);
          }
          while (var6 != null) {
            discarded$3 = param0.append('\n');
            for (var7 = 0; var7 <= param3; var7++) {
              discarded$4 = param0.append(' ');
            }
            var6.appendDebugTree(param3 + 1, param2, param0, 0);
            var6 = (UiWidget) (var5.next(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_11_0 = var5_ref;
          stackIn_11_1 = new StringBuilder().append("sp.SA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    WidgetContainer(int param0, int param1, int param2, int param3, WidgetRenderer param4) {
        super(param0, param1, param2, param3, param4, (WidgetListener) null);
        this.children = new IntrusiveDeque();
    }

    final boolean onMouseWheel(int parentY, int wheelDelta, int guard, int parentX, int pointerY, UiWidget root, int pointerX) {
        IntrusiveDequeCursor var8 = null;
        RuntimeException var8_ref = null;
        UiWidget var9 = null;
        int var10 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          var8 = new IntrusiveDequeCursor(this.children);
          if (guard != -1) {
            return true;
          }
          var9 = (UiWidget) (var8.first((byte) -80));
          while (var9 != null) {
            if (var9.isLinked(false)) {
              if (var9.hasFocus(-1) &&
                var9.onMouseWheel(parentY, wheelDelta, -1, parentX, pointerY, root, pointerX)) {
                return true;
              }
              var9 = (UiWidget) (var8.next(~guard));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_16_0 = var8_ref;
          stackIn_16_1 = new StringBuilder().append("sp.RA(").append(parentY).append(',').append(wheelDelta).append(',').append(guard).append(',').append(parentX).append(',').append(pointerY).append(',');
          if (root == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(pointerX).append(')').toString());
        }
    }

    final boolean focusPrevious(byte guard, UiWidget root) {
        RuntimeException var3 = null;
        UiWidget var4_ref_pk = null;
        int var4 = 0;
        IntrusiveDequeCursor var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        IntrusiveDequeCursor var8 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.children.isEmpty((byte) -86)) {
            return false;
          }
          var8 = new IntrusiveDequeCursor(this.children);
          var4_ref_pk = (UiWidget) (var8.last((byte) -58));
          while (var4_ref_pk != null) {
            if (var4_ref_pk.hasFocus(-1)) {
              var5 = new IntrusiveDequeCursor(this.children);
              var5.startBackwardAt((byte) -70, (IntrusiveNode) (var4_ref_pk));
              var6 = (UiWidget) (var5.previous((byte) 87));
              while (var6 != null) {
                if (var6.requestFocus(root, (byte) 61)) {
                  return true;
                }
                var6 = (UiWidget) (var5.previous((byte) 87));
              }
            }
            var4_ref_pk = (UiWidget) (var8.previous((byte) 87));
          }
          var4 = 39 % ((guard - 84) / 34);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("sp.VA(").append(guard).append(',');
          if (root == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final boolean focusNext(UiWidget root, boolean guard) {
        IntrusiveDequeCursor var3 = null;
        RuntimeException var3_ref = null;
        UiWidget var4 = null;
        IntrusiveDequeCursor var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.children.isEmpty((byte) -87)) {
            return false;
          }
          var3 = new IntrusiveDequeCursor(this.children);
          var4 = (UiWidget) (var3.first((byte) -80));
          while (var4 != null) {
            if (var4.hasFocus(-1)) {
              var5 = new IntrusiveDequeCursor(this.children);
              var5.startForwardAt(14, var4);
              var6 = (UiWidget) (var5.next(0));
              while (var6 != null) {
                if (var6.requestFocus(root, (byte) 61)) {
                  return true;
                }
                var6 = (UiWidget) (var5.next(0));
              }
            }
            var4 = (UiWidget) (var3.next(0));
          }
          if (!guard) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_23_0 = var3_ref;
          stackIn_23_1 = new StringBuilder().append("sp.TA(");
          if (root == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(guard).append(')').toString());
        }
    }

    final StringBuilder appendDebugTree(int indent, Hashtable visited, StringBuilder output, int guard) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginDebugDescription(indent, visited, -22, output)) {
            this.appendDebugDetails(indent, (byte) -128, output, visited);
            this.a(output, (byte) -57, visited, indent);
          }
          if (guard != 0) {
            this.children = (IntrusiveDeque) null;
          }
          stackIn_6_0 = (StringBuilder) (output);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("sp.S(").append(indent).append(',');
          if (visited == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (output == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(guard).append(')').toString());
        }
    }

    String hoveredTooltip(int guard) {
        IntrusiveDequeCursor var2;
        UiWidget var3;
        String var4;
        int var5;
        UiWidget var6;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (guard != -6696) {
          var6 = (UiWidget) null;
          this.requestFocus((UiWidget) null, (byte) 2);
        }
        var2 = new IntrusiveDequeCursor(this.children);
        var3 = (UiWidget) (var2.first((byte) -80));
        while (var3 != null) {
          var4 = var3.hoveredTooltip(-6696);
          if (var4 != null) {
            return var4;
          }
          var3 = (UiWidget) (var2.next(0));
        }
        return null;
    }

    void renderLayer(int parentX, int parentY, byte guard, int layer) {
        int var7 = Sumoblitz.field_L ? 1 : 0;
        if (layer == 0 &&
          null != this.renderer) {
          this.renderer.renderWidget((UiWidget) (this), parentY, 5592405, true, parentX);
        }
        IntrusiveDequeCursor var5 = new IntrusiveDequeCursor(this.children);
        if (guard >= -35) {
          field_x = (int[]) null;
        }
        UiWidget var6 = (UiWidget) (var5.last((byte) -83));
        while (var6 != null) {
          var6.renderLayer(this.x + parentX, this.y + parentY, (byte) -62, layer);
          var6 = (UiWidget) (var5.previous((byte) 87));
        }
    }

    final int maxRenderLayer(int guard) {
        int var6 = 0;
        int var7 = Sumoblitz.field_L ? 1 : 0;
        int var2 = 0;
        IntrusiveDequeCursor var3 = new IntrusiveDequeCursor(this.children);
        int var4 = 51 % ((guard + 10) / 46);
        UiWidget var5 = (UiWidget) (var3.first((byte) -80));
        while (var5 != null) {
          var6 = var5.maxRenderLayer(-99);
          if (var6 > var2) {
            var2 = var6;
          }
          var5 = (UiWidget) (var3.next(0));
        }
        return var2;
    }

    boolean onPointerPressed(UiWidget root, int guard, int pointerY, int button, int parentX, int pointerX, int parentY) {
        IntrusiveDequeCursor var8 = null;
        RuntimeException var8_ref = null;
        UiWidget var9 = null;
        int var10 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          var8 = new IntrusiveDequeCursor(this.children);
          var9 = (UiWidget) (var8.first((byte) -80));
          while (var9 != null) {
            if (var9.isLinked(false)) {
              if (!var9.onPointerPressed(root, -79, pointerY, button, parentX + this.x, pointerX, parentY + this.y)) {
                var9 = (UiWidget) (var8.next(0));
                continue;
              }
              return true;
            }
            break;
          }
          if (guard < -42) {
            return false;
          }
          WAIT_LOGIN_ERROR = (AccountConnectionPhase) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_14_0 = var8_ref;
          stackIn_14_1 = new StringBuilder().append("sp.R(");
          if (root == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(guard).append(',').append(pointerY).append(',').append(button).append(',').append(parentX).append(',').append(pointerX).append(',').append(parentY).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          field_x = (int[]) null;
        }
        WAIT_LOGIN_ERROR = null;
        field_x = null;
    }

    private final void refreshChildren(int guard) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        if (guard != -29587) {
          field_x = (int[]) null;
        }
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.children);
        UiWidget var3 = (UiWidget) (var2.first((byte) -80));
        while (var3 != null) {
          var3.refreshLayout(false);
          var3 = (UiWidget) (var2.next(guard + 29587));
        }
    }

    UiWidget focusedChild(int guard) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.children);
        UiWidget var3_ref_pk = (UiWidget) (var2.first((byte) -80));
        while (var3_ref_pk != null) {
          if (var3_ref_pk.hasFocus(-1)) {
            return var3_ref_pk;
          }
          var3_ref_pk = (UiWidget) (var2.next(0));
        }
        int var3 = -6 / ((guard + 25) / 58);
        return null;
    }

    final void addChild(UiWidget widget, int guard) {
        try {
          this.children.addLast((IntrusiveNode) (widget), (byte) 39);
          if (guard <= 59) {
            field_x = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "sp.UA(" + (widget != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    void clearFocus(byte guard) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.children);
        UiWidget var5 = (UiWidget) (var2.first((byte) -80));
        while (var5 != null) {
          var5.clearFocus((byte) 127);
          var5 = (UiWidget) (var2.next(0));
        }
        int var3 = -115 % ((guard - 64) / 51);
    }

    boolean requestFocus(UiWidget root, byte guard) {
        IntrusiveDequeCursor var3 = null;
        RuntimeException var3_ref = null;
        UiWidget var4 = null;
        int var5 = 0;
        UiWidget var6 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          var3 = new IntrusiveDequeCursor(this.children);
          var4 = (UiWidget) (var3.first((byte) -80));
          if (guard != 61) {
            var6 = (UiWidget) null;
            this.update(27, -11, (UiWidget) null, -73);
          }
          while (var4 != null) {
            if (var4.requestFocus(root, (byte) 61)) {
              return true;
            }
            var4 = (UiWidget) (var3.next(0));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("sp.Q(");
          if (root == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(guard).append(')').toString());
        }
    }

    void update(int parentX, int guard, UiWidget root, int parentY) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        IntrusiveDequeCursor var6 = null;
        UiWidget var7 = null;
        int var8 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5_int = -16 % ((-25 - guard) / 45);
          super.update(parentX, 105, root, parentY);
          var6 = new IntrusiveDequeCursor(this.children);
          var7 = (UiWidget) (var6.first((byte) -80));
          while (var7 != null) {
            if (var7.isLinked(false)) {
              var7.update(this.x + parentX, -88, root, parentY + this.y);
              var7 = (UiWidget) (var6.next(0));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("sp.U(").append(parentX).append(',').append(guard).append(',');
          if (root == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(parentY).append(')').toString());
        }
    }

    boolean hasFocus(int guard) {
        if (guard != -1) {
          WAIT_LOGIN_ERROR = (AccountConnectionPhase) null;
        }
        return null != this.focusedChild(55) ? true : false;
    }

    void setBounds(int guard, int newX, int newY, int newHeight, int newWidth) {
        int var6 = -30 / ((28 - guard) / 63);
        super.setBounds(94, newX, newY, newHeight, newWidth);
        this.refreshChildren(-29587);
    }

    final void onPointerReleased(UiWidget root, boolean guard, int parentX, int pointerY, int pointerX, int parentY) {
        RuntimeException runtimeException = null;
        IntrusiveDequeCursor var7 = null;
        UiWidget var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard) {
            return;
          }
          var7 = new IntrusiveDequeCursor(this.children);
          var8 = (UiWidget) (var7.first((byte) -80));
          while (var8 != null) {
            if (var8.isLinked(guard)) {
              var8.onPointerReleased(root, false, parentX + this.x, pointerY, pointerX, this.y + parentY);
              var8 = (UiWidget) (var7.next(0));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("sp.T(");
          if (root == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(guard).append(',').append(parentX).append(',').append(pointerY).append(',').append(pointerX).append(',').append(parentY).append(')').toString());
        }
    }

    boolean onKey(UiWidget root, char character, byte guard, int keyCode) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        IntrusiveDequeCursor var8 = null;
        UiWidget var9 = null;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          var8 = new IntrusiveDequeCursor(this.children);
          var9 = (UiWidget) (var8.first((byte) -80));
          if (guard <= 9) {
            field_x = (int[]) null;
          }
          while (var9 != null) {
            if (var9.isLinked(false)) {
              if (var9.hasFocus(-1) &&
                var9.onKey(root, character, (byte) 67, keyCode)) {
                return true;
              }
              var9 = (UiWidget) (var8.next(0));
              continue;
            }
            break;
          }
          var6 = keyCode;
          if (var6 != 80) {
            return false;
          }
          if (!AudioOutputBootstrap.field_b[81]) {
            stackIn_15_0 = this.focusNext(root, false);
          } else {
            stackIn_15_0 = this.focusPrevious((byte) -5, root);
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("sp.KA(");
          if (root == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(character).append(',').append(guard).append(',').append(keyCode).append(')').toString());
        }
    }

    static {
        field_x = new int[]{0, 4, 6, 8, 12, 16, 18, 20, 24};
        WAIT_LOGIN_ERROR = new AccountConnectionPhase();
    }
}
