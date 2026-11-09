/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ArrayWidgetContainer extends UiWidget implements CompositeWidgetMarker {
    UiWidget[] children;
    static TextureFilter LINEAR;
    static String unableToConnectToText;

    boolean requestFocus(UiWidget root, byte guard) {
        int var4 = 0;
        UiWidget[] var3 = null;
        RuntimeException var3_ref = null;
        UiWidget var5 = null;
        int var6 = 0;
        UiWidget[] var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          var7 = this.children;
          var3 = var7;
          if (guard != 61) {
            this.children = (UiWidget[]) null;
          }
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null &&
              var5.requestFocus(root, (byte) 61)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("ao.Q(");
          if (root == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(guard).append(')').toString());
        }
    }

    final boolean focusNextByStride(UiWidget root, byte guard, int stride) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        UiWidget var6 = null;
        UiWidget var7 = null;
        int var8 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (null == this.children) {
            return false;
          }
          var4_int = 0;
          var5 = -106 / ((28 - guard) / 42);
          while (var4_int < this.children.length) {
            var6 = this.children[var4_int];
            if (var6 != null &&
              var6.hasFocus(-1)) {
              for (var4_int = var4_int + stride; var4_int < this.children.length; var4_int = var4_int + stride) {
                var7 = this.children[var4_int];
                if (var7 != null &&
                  var7.requestFocus(root, (byte) 61)) {
                  return true;
                }
              }
            }
            var4_int++;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("ao.G(");
          if (root == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(guard).append(',').append(stride).append(')').toString());
        }
    }

    boolean onKey(UiWidget root, char character, byte guard, int keyCode) {
        int var6 = 0;
        UiWidget[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        UiWidget var7 = null;
        int var8 = 0;
        UiWidget[] var9 = null;
        boolean stackIn_19_0 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.children == null) {
            return false;
          }
          if (guard < 9) {
            ArrayWidgetContainer.releaseStatics(-24);
          }
          var9 = this.children;
          var5 = var9;
          for (var6 = 0; var6 < var9.length; var6++) {
            var7 = var9[var6];
            if (var7 != null &&
              var7.hasFocus(-1) &&
              var7.onKey(root, character, (byte) 72, keyCode)) {
              return true;
            }
          }
          var5_int = keyCode;
          if (var5_int != 80) {
            return false;
          }
          if (!hw.field_b[81]) {
            stackIn_19_0 = this.focusNext((byte) -17, root);
          } else {
            stackIn_19_0 = this.focusPrevious(root, (byte) 113);
          }
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_24_0 = var5_ref;
          stackIn_24_1 = new StringBuilder().append("ao.KA(");
          if (root == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(character).append(',').append(guard).append(',').append(keyCode).append(')').toString());
        }
    }

    ArrayWidgetContainer(int param0, int param1, int param2, int param3, WidgetRenderer param4) {
        super(param0, param1, param2, param3, param4, (WidgetListener) null);
    }

    final boolean focusNext(byte guard, UiWidget root) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != -17) {
            this.hasFocus(-97);
          }
          stackIn_3_0 = this.focusNextByStride(root, (byte) -49, 1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ao.F(").append(guard).append(',');
          if (root == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final StringBuilder appendDebugTree(int indent, Hashtable visited, StringBuilder output, int guard) {
        RuntimeException var5 = null;
        UiWidget var6 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 0) {
            var6 = (UiWidget) null;
            this.focusPrevious((UiWidget) null, (byte) -86);
          }
          if (this.beginDebugDescription(indent, visited, -124, output)) {
            this.appendDebugDetails(indent, (byte) -128, output, visited);
            this.a(visited, indent, 10, output);
          }
          stackIn_6_0 = (StringBuilder) (output);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ao.S(").append(indent).append(',');
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

    void update(int parentX, int guard, UiWidget root, int parentY) {
        int var7 = 0;
        UiWidget[] var5 = null;
        int var6 = 0;
        UiWidget var8 = null;
        int var9 = 0;
        UiWidget[] var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          super.update(parentX, -118, root, parentY);
          if (null == this.children) {
            return;
          }
          var10 = this.children;
          var5 = var10;
          var6 = 102 % ((-25 - guard) / 45);
          for (var7 = 0; var10.length > var7; var7++) {
            var8 = var10[var7];
            if (var8 != null) {
              var8.update(this.x + parentX, 95, root, this.y + parentY);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_11_0 = var5_ref;
          stackIn_11_1 = new StringBuilder().append("ao.U(").append(parentX).append(',').append(guard).append(',');
          if (root == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(parentY).append(')').toString());
        }
    }

    final void clearFocus(byte guard) {
        int var4 = 0;
        int var2;
        UiWidget[] var3;
        UiWidget var5;
        int var6;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var2 = 2 % ((guard - 64) / 51);
        var3 = this.children;
        for (var4 = 0; var4 < var3.length; var4++) {
          var5 = var3[var4];
          if (var5 != null) {
            var5.clearFocus((byte) -68);
          }
        }
    }

    abstract void layoutChildren(boolean guard);

    final String hoveredTooltip(int guard) {
        int var3 = 0;
        UiWidget[] var2;
        UiWidget var4;
        int var6;
        String var5;
        var6 = Sumoblitz.field_L ? 1 : 0;
        if (guard != -6696) {
          return (String) null;
        }
        if (this.children == null) {
          return null;
        }
        var2 = this.children;
        for (var3 = 0; var3 < var2.length; var3++) {
          var4 = var2[var3];
          if (var4 != null) {
            var5 = var4.hoveredTooltip(-6696);
            if (var5 != null) {
              return var5;
            }
          }
        }
        return null;
    }

    final void renderLayer(int parentX, int parentY, byte guard, int layer) {
        int var5 = 0;
        UiWidget var6;
        int var7;
        UiWidget var8;
        var7 = Sumoblitz.field_L ? 1 : 0;
        if (layer == 0 &&
          this.renderer != null) {
          this.renderer.renderWidget((UiWidget) (this), parentY, 5592405, true, parentX);
        }
        if (this.children != null) {
          for (var5 = -1 + this.children.length; var5 >= 0; var5--) {
            var6 = this.children[var5];
            if (var6 != null) {
              var6.renderLayer(this.x + parentX, this.y + parentY, (byte) -62, layer);
            }
          }
        }
        if (guard > -35) {
          var8 = (UiWidget) null;
          this.onPointerPressed((UiWidget) null, -125, -13, -18, -36, 44, -11);
        }
    }

    final void onPointerReleased(UiWidget root, boolean guard, int parentX, int pointerY, int pointerX, int parentY) {
        int var8 = 0;
        UiWidget[] var7 = null;
        UiWidget var9 = null;
        int var10 = 0;
        UiWidget[] var11 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.children == null) {
            return;
          }
          var11 = this.children;
          var7 = var11;
          for (var8 = 0; var8 < var11.length; var8++) {
            var9 = var11[var8];
            if (var9 != null) {
              var9.onPointerReleased(root, false, parentX + this.x, pointerY, pointerX, parentY + this.y);
            }
          }
          if (guard) {
            this.hasFocus(49);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_14_0 = var7_ref;
          stackIn_14_1 = new StringBuilder().append("ao.T(");
          if (root == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(guard).append(',').append(parentX).append(',').append(pointerY).append(',').append(pointerX).append(',').append(parentY).append(')').toString());
        }
    }

    boolean onMouseWheel(int parentY, int wheelDelta, int guard, int parentX, int pointerY, UiWidget root, int pointerX) {
        int var9 = 0;
        UiWidget[] var8 = null;
        RuntimeException var8_ref = null;
        UiWidget var10 = null;
        int var11 = 0;
        UiWidget var12 = null;
        UiWidget[] var13 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard != -1) {
            var12 = (UiWidget) null;
            this.onKey((UiWidget) null, 'ﾅ', (byte) -58, -49);
          }
          if (this.children == null) {
            return false;
          }
          var13 = this.children;
          var8 = var13;
          for (var9 = 0; var13.length > var9; var9++) {
            var10 = var13[var9];
            if (var10 != null &&
              var10.hasFocus(-1) &&
              var10.onMouseWheel(parentY, wheelDelta, -1, parentX, pointerY, root, pointerX)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_19_0 = var8_ref;
          stackIn_19_1 = new StringBuilder().append("ao.RA(").append(parentY).append(',').append(wheelDelta).append(',').append(guard).append(',').append(parentX).append(',').append(pointerY).append(',');
          if (root == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(pointerX).append(')').toString());
        }
    }

    private final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        int var6 = 0;
        StringBuilder discarded$6 = null;
        int var8 = 0;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$7 = null;
        UiWidget var7 = null;
        int var9 = 0;
        UiWidget var10 = null;
        UiWidget[] var11 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.children == null) {
            return;
          }
          if (param2 != 10) {
            var10 = (UiWidget) null;
            this.requestFocus((UiWidget) null, (byte) -20);
          }
          var11 = this.children;
          for (var6 = 0; var11.length > var6; var6++) {
            var7 = var11[var6];
            discarded$6 = param3.append('\n');
            for (var8 = 0; param1 >= var8; var8++) {
              discarded$8 = param3.append(' ');
            }
            if (var7 != null) {
              var7.appendDebugTree(1 + param1, param0, param3, 0);
            } else {
              discarded$7 = param3.append("null");
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("ao.E(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null &&
            param0.length() >= ValidationMessageWidget.field_T) {
            if (param0.length() > OpenGlRectangleTexture.field_k) {
              return true;
            }
            if (param1 == 30996) {
              return false;
            }
            return true;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("ao.D(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean focusPrevious(UiWidget root, byte guard) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard == 113) {
            stackIn_4_0 = this.focusPreviousByStride((byte) -128, root, 1);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ao.H(");
          if (root == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(guard).append(')').toString());
        }
    }

    private final UiWidget focusedChild(boolean guard) {
        int var3 = 0;
        UiWidget[] var2;
        UiWidget var4;
        int var5;
        UiWidget[] var6;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (this.children == null) {
          return null;
        }
        if (!guard) {
          return (UiWidget) null;
        }
        var6 = this.children;
        var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          if (var4 != null &&
            var4.hasFocus(-1)) {
            return var4;
          }
        }
        return null;
    }

    final boolean focusPreviousByStride(byte guard, UiWidget root, int stride) {
        int var4_int = 0;
        RuntimeException var4 = null;
        UiWidget var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        Object stackIn_8_0 = null;
        UiWidget stackIn_8_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.children == null) {
            return false;
          }
          var4_int = -1 + this.children.length;
          while (var4_int >= 0) {
            var5 = this.children[var4_int];
            stackIn_8_0 = null;
            stackIn_8_1 = var5;
            if (stackIn_8_0 != stackIn_8_1 &&
              var5.hasFocus(-1)) {
              for (var4_int = var4_int - stride; var4_int >= 0; var4_int = var4_int - stride) {
                var6 = this.children[var4_int];
                if (null != var6 &&
                  var6.requestFocus(root, (byte) 61)) {
                  return true;
                }
              }
            }
            var4_int--;
          }
          if (guard <= -127) {
            return false;
          }
          this.maxRenderLayer(-70);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("ao.J(").append(guard).append(',');
          if (root == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(stride).append(')').toString());
        }
    }

    final boolean hasFocus(int guard) {
        if (guard != -1) {
          unableToConnectToText = (String) null;
        }
        return this.focusedChild(true) != null ? true : false;
    }

    void setBounds(int guard, int newX, int newY, int newHeight, int newWidth) {
        super.setBounds(-51, newX, newY, newHeight, newWidth);
        int var6 = 53 / ((28 - guard) / 63);
        this.layoutChildren(false);
    }

    public static void releaseStatics(int param0) {
        unableToConnectToText = null;
        LINEAR = null;
        if (param0 != 0) {
          String var2 = (String) null;
          ArrayWidgetContainer.a((String) null, -34);
        }
    }

    boolean onPointerPressed(UiWidget root, int guard, int pointerY, int button, int parentX, int pointerX, int parentY) {
        int var9 = 0;
        UiWidget[] var8 = null;
        RuntimeException var8_ref = null;
        UiWidget var10 = null;
        int var11 = 0;
        UiWidget[] var12 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (null == this.children) {
            return false;
          }
          var12 = this.children;
          var8 = var12;
          if (guard > -42) {
            LINEAR = (TextureFilter) null;
          }
          for (var9 = 0; var12.length > var9; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.onPointerPressed(root, -84, pointerY, button, this.x + parentX, pointerX, parentY + this.y)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_19_0 = var8_ref;
          stackIn_19_1 = new StringBuilder().append("ao.R(");
          if (root == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(guard).append(',').append(pointerY).append(',').append(button).append(',').append(parentX).append(',').append(pointerX).append(',').append(parentY).append(')').toString());
        }
    }

    final int maxRenderLayer(int guard) {
        int var2;
        UiWidget[] var3;
        int var4;
        UiWidget var5;
        int var7;
        int var6;
        int var4Lifetime1;
        var7 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0;
        var3 = this.children;
        for (var4 = 0; var4 < var3.length; var4++) {
          var5 = var3[var4];
          if (var5 != null) {
            var6 = var5.maxRenderLayer(-117);
            if (var2 < var6) {
              var2 = var6;
            }
          }
        }
        var4Lifetime1 = -37 / ((guard + 10) / 46);
        return var2;
    }

    static {
        LINEAR = new TextureFilter();
        unableToConnectToText = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
