/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class InteractiveWidget extends UiWidget {
    int actionCode;
    static String returnToMainMenuText;
    private boolean focusable;
    private boolean focused;
    boolean selected;
    static boolean[] enabledAccountPackets;
    boolean enabled;

    boolean requestFocus(UiWidget root, byte guard) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.enabled) {
            return false;
          }
          if (!this.focusable) {
            return false;
          }
          root.clearFocus((byte) 122);
          if (guard != 61) {
            return true;
          }
          this.focused = true;
          if (this.listener != null &&
            this.listener instanceof WidgetFocusListener) {
            ((WidgetFocusListener) (this.listener)).onFocusChanged(this.focused, (UiWidget) (this), -112);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("wp.Q(");
          if (root == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(guard).append(')').toString());
        }
    }

    final void clearFocus(byte guard) {
        int var2 = 61 / ((guard - 64) / 51);
        if (!this.focused) {
          return;
        }
        this.focused = false;
        if (null == this.listener) {
          return;
        }
        if (!(this.listener instanceof WidgetFocusListener)) {
          return;
        }
        ((WidgetFocusListener) (this.listener)).onFocusChanged(this.focused, (UiWidget) (this), -76);
    }

    boolean onKey(UiWidget root, char character, byte guard, int keyCode) {
        RuntimeException var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard < 9) {
            this.clearFocus((byte) -47);
          }
          if (!this.hasFocus(-1)) {
            return false;
          }
          if (keyCode != 84 &&
            keyCode != 83) {
            return false;
          }
          this.notifyAction(1, -1, true, -1);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("wp.KA(");
          if (root == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(character).append(',').append(guard).append(',').append(keyCode).append(')').toString());
        }
    }

    InteractiveWidget(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetListener param5) {
        super(param0, param1, param2, param3, param4, param5);
        this.focused = false;
        this.actionCode = 0;
        this.focusable = true;
        this.enabled = true;
    }

    final static LegacyOpenGlSpriteTexture a(LegacyOpenGlGraphicsToolkit param0, int param1, int param2, byte[] param3, boolean param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        LegacyOpenGlSpriteTexture stackIn_7_0 = null;
        LegacyOpenGlSpriteTexture stackIn_10_0 = null;
        LegacyOpenGlSpriteTexture stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 <= 105) {
            InteractiveWidget.releaseStatics((byte) 46);
          }
          if (!param0.field_Cc && (!IntegerMath.isSingleBitOrZero(param2, -105) ||
            !IntegerMath.isSingleBitOrZero(param1, -103))) {
            if (param0.field_C) {
              stackIn_12_0 = new LegacyOpenGlSpriteTexture(param0, 34037, param5, param2, param1, param4, param3, param7);
              return stackIn_12_0;
            }
            stackIn_10_0 = new LegacyOpenGlSpriteTexture(param0, param5, param2, param1, LegacyOpenGlVertexBuffer.nextPowerOfTwo(false, param2), LegacyOpenGlVertexBuffer.nextPowerOfTwo(false, param1), param3, param7);
            return stackIn_10_0;
          }
          stackIn_7_0 = new LegacyOpenGlSpriteTexture(param0, 3553, param5, param2, param1, param4, param3, param7);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("wp.K(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    InteractiveWidget(String param0, WidgetListener param1) {
        this(param0, HardwareTurbulentWaterNoise.widgetTheme.textInputRenderer, param1);
    }

    final void onPointerReleased(UiWidget root, boolean guard, int parentX, int pointerY, int pointerX, int parentY) {
        if (guard) {
          return;
        }
        try {
          if (null != this.listener &&
            this.listener instanceof WidgetPointerListener) {
            ((WidgetPointerListener) (this.listener)).onPointerReleased(parentY, parentX, pointerY, pointerX, this, -21726);
          }
          this.pressedButton = 0;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "wp.T(" + (root != null ? "{...}" : "null") + ',' + guard + ',' + parentX + ',' + pointerY + ',' + pointerX + ',' + parentY + ')');
        }
    }

    boolean onPointerPressed(UiWidget root, int guard, int pointerY, int button, int parentX, int pointerX, int parentY) {
        RuntimeException var8 = null;
        UiWidget var9 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard > -42) {
            var9 = (UiWidget) null;
            this.onPointerPressed((UiWidget) null, 108, 43, 75, 47, -24, -60);
          }
          if (!this.enabled) {
            return false;
          }
          if (!this.containsPoint(pointerX, -1, parentX, pointerY, parentY)) {
            return false;
          }
          this.requestFocus(root, (byte) 61);
          this.pressedButton = button;
          if (null != this.listener &&
            this.listener instanceof WidgetPointerListener) {
            ((WidgetPointerListener) (this.listener)).onPointerPressed(pointerX, button, parentX, this, pointerY, parentY, false);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("wp.R(");
          if (root == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(guard).append(',').append(pointerY).append(',').append(button).append(',').append(parentX).append(',').append(pointerX).append(',').append(parentY).append(')').toString());
        }
    }

    final StringBuilder appendDebugTree(int indent, Hashtable visited, StringBuilder output, int guard) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginDebugDescription(indent, visited, -121, output)) {
            this.appendDebugDetails(indent, (byte) -128, output, visited);
            if (this.selected) {
              discarded$2 = output.append(" active");
            }
            if (!this.enabled) {
              discarded$3 = output.append(" disabled");
            }
          }
          if (guard != 0) {
            this.actionCode = 96;
          }
          stackIn_8_0 = (StringBuilder) (output);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("wp.S(").append(indent).append(',');
          if (visited == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (output == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(guard).append(')').toString());
        }
    }

    void update(int parentX, int guard, UiWidget root, int parentY) {
        try {
          int var5_int = -37 % ((-25 - guard) / 45);
          super.update(parentX, 49, root, parentY);
          this.actionCode = 0;
          if (this.pressedButton != 0) {
            if (this.pressedButton == HotspotTextWidget.activePointerButton) {
              return;
            }
            if (this.containsPoint(PointLight.mouseX, -1, parentX, ArenaDefinitionCodec.field_e, parentY) &&
              0 == HotspotTextWidget.activePointerButton) {
              this.notifyAction(this.pressedButton, PointLight.mouseX - parentX, true, ArenaDefinitionCodec.field_e - parentY);
            }
            this.onPointerReleased(root, false, parentX, ArenaDefinitionCodec.field_e, PointLight.mouseX, parentY);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "wp.U(" + parentX + ',' + guard + ',' + (root != null ? "{...}" : "null") + ',' + parentY + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        enabledAccountPackets = null;
        returnToMainMenuText = null;
        int var1 = 124 % ((param0 + 16) / 53);
    }

    InteractiveWidget(String param0, WidgetRenderer param1, WidgetListener param2) {
        super(param0, param1, param2);
        this.focused = false;
        this.actionCode = 0;
        this.focusable = true;
        this.enabled = true;
    }

    final boolean hasFocus(int guard) {
        if (guard != -1) {
          this.enabled = false;
          return this.focused;
        }
        return this.focused;
    }

    void notifyAction(int action, int pointerX, boolean guard, int pointerY) {
        this.actionCode = action;
        if (this.listener != null) {
          if (!(this.listener instanceof WidgetActionListener)) {
            if (!guard) {
              this.focusable = true;
              return;
            }
            return;
          }
          ((WidgetActionListener) (this.listener)).onAction(action, 710, this, pointerX, pointerY);
        }
        if (guard) {
          return;
        }
        this.focusable = true;
    }

    public InteractiveWidget() {
        this.focused = false;
        this.actionCode = 0;
        this.focusable = true;
        this.enabled = true;
        this.renderer = HardwareTurbulentWaterNoise.widgetTheme.field_n;
    }

    static {
        returnToMainMenuText = "Return to main menu";
        enabledAccountPackets = new boolean[64];
    }
}
