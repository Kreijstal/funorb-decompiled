/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class SingleChildWidget extends UiWidget implements CompositeWidgetMarker {
    static int field_x;
    UiWidget child;

    private final boolean focusPrevious(boolean guard, UiWidget root) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard) {
            this.child = (UiWidget) null;
          }
          stackIn_7_0 = (this.child != null) && (!this.child.hasFocus(-1)) && (this.child.requestFocus(root, (byte) 61));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ie.K(").append(guard).append(',');
          if (root == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static jj[] a(int param0) {
        if (param0 == 32) {
          return new jj[]{go.field_m, LevelSelectScreen.field_j, na.field_c};
        }
        java.applet.Applet var2 = (java.applet.Applet) null;
        SingleChildWidget.setSessionCookie(-3, (String) null, (java.applet.Applet) null);
        return new jj[]{go.field_m, LevelSelectScreen.field_j, na.field_c};
    }

    final void appendChildDebugTree(int indent, StringBuilder output, Hashtable visited, byte guard) {
        StringBuilder discarded$12 = null;
        int var5_int = 0;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$13 = null;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          discarded$12 = output.append('\n');
          if (guard != -43) {
            this.maxRenderLayer(-119);
          }
          for (var5_int = 0; indent >= var5_int; var5_int++) {
            discarded$14 = output.append(' ');
          }
          if (null != this.child) {
            this.child.appendDebugTree(1 + indent, visited, output, 0);
            return;
          }
          discarded$13 = output.append("null");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ie.L(").append(indent).append(',');
          if (output == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (visited == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(guard).append(')').toString());
        }
    }

    boolean onPointerPressed(UiWidget root, int guard, int pointerY, int button, int parentX, int pointerX, int parentY) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard >= -42) {
            return false;
          }
          stackIn_7_0 = (this.child != null) && (this.child.onPointerPressed(root, -124, pointerY, button, parentX + this.x, pointerX, parentY + this.y));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("ie.R(");
          if (root == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(guard).append(',').append(pointerY).append(',').append(button).append(',').append(parentX).append(',').append(pointerX).append(',').append(parentY).append(')').toString());
        }
    }

    final boolean requestFocus(UiWidget root, byte guard) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 61) {
            this.renderLayer(-20, -76, (byte) -66, -38);
          }
          stackIn_6_0 = (this.child != null) && (this.child.requestFocus(root, (byte) 61));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ie.Q(");
          if (root == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(guard).append(')').toString());
        }
    }

    final void clearFocus(byte guard) {
        int var2 = 0;
        int var2Lifetime1;
        if (this.child == null) {
          var2 = 71 % ((guard - 64) / 51);
          return;
        }
        this.child.clearFocus((byte) 121);
        var2Lifetime1 = 71 % ((guard - 64) / 51);
    }

    void renderLayer(int parentX, int parentY, byte guard, int layer) {
        if (layer == 0) {
          if (this.renderer == null) {
            if (null == this.child) {
              if (guard <= -35) {
                return;
              }
              this.maxRenderLayer(31);
              return;
            }
            this.child.renderLayer(this.x + parentX, this.y + parentY, (byte) -38, layer);
            if (guard > -35) {
              this.maxRenderLayer(31);
              return;
            }
            return;
          }
          this.renderer.renderWidget((UiWidget) (this), parentY, 5592405, true, parentX);
        }
        if (null != this.child) {
          this.child.renderLayer(this.x + parentX, this.y + parentY, (byte) -38, layer);
          if (guard <= -35) {
            return;
          }
          this.maxRenderLayer(31);
          return;
        }
        if (guard <= -35) {
          return;
        }
        this.maxRenderLayer(31);
    }

    final int maxRenderLayer(int guard) {
        int var2 = 47 % ((-10 - guard) / 46);
        return this.child == null ? 0 : this.child.maxRenderLayer(-66);
    }

    void layoutChild(boolean guard) {
        if (this.child != null) {
          this.child.refreshLayout(guard);
        }
        if (guard) {
          field_x = 127;
          return;
        }
    }

    final boolean onKey(UiWidget root, char character, byte guard, int keyCode) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.child != null &&
            this.child.hasFocus(-1) &&
            this.child.onKey(root, character, (byte) 64, keyCode)) {
            return true;
          }
          var5_int = keyCode;
          if (var5_int != 80) {
            if (guard >= 9) {
              return false;
            }
            this.child = (UiWidget) null;
            return false;
          }
          if (hw.field_b[81]) {
            stackIn_9_0 = this.focusPrevious(false, root);
          } else {
            stackIn_9_0 = this.focusNext(root, false);
          }
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("ie.KA(");
          if (root == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(character).append(',').append(guard).append(',').append(keyCode).append(')').toString());
        }
    }

    void update(int parentX, int guard, UiWidget root, int parentY) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -91 / ((guard + 25) / 45);
          super.update(parentX, -84, root, parentY);
          if (null == this.child) {
            return;
          }
          this.child.update(this.x + parentX, -109, root, parentY + this.y);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ie.U(").append(parentX).append(',').append(guard).append(',');
          if (root == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(parentY).append(')').toString());
        }
    }

    final boolean hasFocus(int guard) {
        if (guard != -1) {
          return false;
        }
        return this.focusedChild(16777216) != null ? true : false;
    }

    final static void setSessionCookie(int guard, String sessionValue, java.applet.Applet applet) {
        try {
          String var7 = null;
          String var5 = null;
          String var8 = null;
          String var6 = null;
          try {
            int var3_int = -31 % ((-22 - guard) / 49);
            js.field_J = sessionValue;
            try {
              var7 = applet.getParameter("cookieprefix");
              var5 = applet.getParameter("cookiehost");
              var8 = var7 + "session=" + sessionValue + "; version=1; path=/; domain=" + var5;
              var6 = var8;
              if (sessionValue.length() == 0) {
                var6 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              tw.a("document.cookie=\"" + var6 + "\"", -15428, applet);
            } catch (Throwable throwable) {
            }
            va.a(false, applet);
          } catch (RuntimeException runtimeException) {
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ie.M(" + guard + ',' + (sessionValue != null ? "{...}" : "null") + ',' + (applet != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    StringBuilder appendDebugTree(int indent, Hashtable visited, StringBuilder output, int guard) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginDebugDescription(indent, visited, 103, output)) {
            this.appendDebugDetails(indent, (byte) -128, output, visited);
            this.appendChildDebugTree(indent, output, visited, (byte) -43);
          }
          if (guard != 0) {
            this.renderLayer(-113, -16, (byte) 74, 71);
          }
          stackIn_5_0 = (StringBuilder) (output);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ie.S(").append(indent).append(',');
          if (visited == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (output == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(guard).append(')').toString());
        }
    }

    UiWidget focusedChild(int guard) {
        UiWidget var2 = null;
        UiWidget var2Lifetime1;
        if (guard != 16777216) {
          this.child = (UiWidget) null;
          var2 = this.child;
          if (var2 == null) {
            return null;
          }
          if (var2.hasFocus(-1)) {
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.child;
        if (var2Lifetime1 == null) {
          return null;
        }
        if (var2Lifetime1.hasFocus(-1)) {
          return var2Lifetime1;
        }
        return null;
    }

    void onPointerReleased(UiWidget root, boolean guard, int parentX, int pointerY, int pointerX, int parentY) {
        RuntimeException var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.child != null) {
            this.child.onPointerReleased(root, guard, this.x + parentX, pointerY, pointerX, parentY + this.y);
          }
          if (!guard) {
            return;
          }
          field_x = -44;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("ie.T(");
          if (root == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(guard).append(',').append(parentX).append(',').append(pointerY).append(',').append(pointerX).append(',').append(parentY).append(')').toString());
        }
    }

    final void setBounds(int guard, int newX, int newY, int newHeight, int newWidth) {
        int var6 = -17 / ((28 - guard) / 63);
        super.setBounds(117, newX, newY, newHeight, newWidth);
        this.layoutChild(false);
    }

    SingleChildWidget(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetListener param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    String hoveredTooltip(int guard) {
        String var2 = super.hoveredTooltip(guard);
        if (null == this.child) {
          return var2;
        }
        String var3 = this.child.hoveredTooltip(-6696);
        if (var3 == null) {
          return var2;
        }
        return var3;
    }

    private final boolean focusNext(UiWidget root, boolean guard) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        UiWidget var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard) {
            var4 = (UiWidget) null;
            discarded$1 = this.focusNext((UiWidget) null, false);
          }
          stackIn_7_0 = (null != this.child) && (!this.child.hasFocus(-1)) && (this.child.requestFocus(root, (byte) 61));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ie.N(");
          if (root == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(guard).append(')').toString());
        }
    }

    final boolean onMouseWheel(int parentY, int wheelDelta, int guard, int parentX, int pointerY, UiWidget root, int pointerX) {
        RuntimeException var8 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != -1) {
            return false;
          }
          stackIn_8_0 = (null != this.child) && (this.child.hasFocus(-1)) && (this.child.onMouseWheel(parentY, wheelDelta, guard + 0, parentX, pointerY, root, pointerX));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("ie.RA(").append(parentY).append(',').append(wheelDelta).append(',').append(guard).append(',').append(parentX).append(',').append(pointerY).append(',');
          if (root == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(pointerX).append(')').toString());
        }
    }

    static {
    }
}
