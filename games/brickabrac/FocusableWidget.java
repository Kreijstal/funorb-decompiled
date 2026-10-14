/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class FocusableWidget extends Widget {
    private boolean focusable;
    static String field_C;
    private boolean focused;
    static String field_D;
    boolean active;
    static String field_G;
    static int recentRenderRate;
    boolean enabled;

    public static void g(int param0) {
        if (param0 > -22) {
          return;
        }
        field_G = null;
        field_C = null;
        field_D = null;
    }

    final void clearFocus(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          Widget var3 = (Widget) null;
          this.updatePointer((Widget) null, (byte) -52, -45, 104);
          if (!this.focused) {
            return;
          }
          this.focused = false;
          if (this.listener == null) {
            return;
          }
          if (!(this.listener instanceof WidgetFocusListener)) {
            return;
          }
          ((WidgetFocusListener) (this.listener)).onFocusChanged(this.focused, (Widget) (this), 19365);
          return;
        }
        if (!this.focused) {
          return;
        }
        this.focused = false;
        if (this.listener == null) {
          return;
        }
        if (!(this.listener instanceof WidgetFocusListener)) {
          return;
        }
        ((WidgetFocusListener) (this.listener)).onFocusChanged(this.focused, (Widget) (this), 19365);
    }

    FocusableWidget(String param0, WidgetListener param1) {
        this(param0, PopupWidgetLayer.widgetTheme.defaultFocusableRenderer, param1);
    }

    FocusableWidget(String text, WidgetRenderer renderer, WidgetListener listener) {
        super(text, renderer, listener);
        this.focusable = true;
        this.focused = false;
        this.enabled = true;
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param3, 1595637992, param0, param1)) {
            this.a(param1, param0, 0, param3);
            if (this.active) {
              discarded$2 = param3.append(" active");
            }
            if (!this.enabled) {
              discarded$3 = param3.append(" disabled");
            }
          }
          if (param2 != 24) {
            this.focused = true;
          }
          stackIn_10_0 = (StringBuilder) (param3);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("d.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    boolean handlePointerPress(Widget focusRoot, int pointerX, int parentX, int parentY, int button, int pointerY, int obfuscationGuard) {
        RuntimeException var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.enabled &&
            this.containsPoint(pointerY, parentY, parentX, obfuscationGuard + 3, pointerX)) {
            this.tryFocus(true, focusRoot);
            this.pressedButton = button;
            if (this.listener != null) {
              if (!(this.listener instanceof WidgetPointerListener)) {
                return true;
              }
              ((WidgetPointerListener) (this.listener)).onPointerPress(parentX, button, this, pointerY, pointerX, parentY, -13469);
            }
            return true;
          }
          if (obfuscationGuard == 0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_16_0 = var8;
          stackIn_16_1 = new StringBuilder().append("d.MA(");
          if (focusRoot == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(pointerX).append(',').append(parentX).append(',').append(parentY).append(',').append(button).append(',').append(pointerY).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    void dispatchAction(int pointerY, int button, int obfuscationGuard, int pointerX) {
        if (this.listener == null) {
          if (obfuscationGuard < -8) {
            return;
          }
          this.isFocused(-13);
          return;
        }
        if (!(this.listener instanceof WidgetActionListener)) {
          if (obfuscationGuard < -8) {
            return;
          }
          this.isFocused(-13);
          return;
        }
        ((WidgetActionListener) (this.listener)).onAction(pointerY, button, (byte) -60, pointerX, this);
        if (obfuscationGuard < -8) {
          return;
        }
        this.isFocused(-13);
    }

    boolean tryFocus(boolean obfuscationGuard, Widget focusRoot) {
        RuntimeException var3 = null;
        Widget stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        boolean stackIn_11_1 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.enabled &&
            this.focusable) {
            stackIn_7_0 = (Widget) (focusRoot);
            stackIn_8_1 = !(obfuscationGuard);
            ((Widget) (Object) stackIn_7_0).clearFocus(stackIn_8_1);
            stackIn_11_1 = (obfuscationGuard);
            this.focused = stackIn_11_1;
            if (null != this.listener) {
              if (!(this.listener instanceof WidgetFocusListener)) {
                return true;
              }
              ((WidgetFocusListener) (this.listener)).onFocusChanged(this.focused, (Widget) (this), 19365);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("d.CA(").append(obfuscationGuard).append(',');
          if (focusRoot == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    void updatePointer(Widget focusRoot, byte obfuscationGuard, int parentX, int parentY) {
        try {
          super.updatePointer(focusRoot, obfuscationGuard, parentX, parentY);
          if (this.pressedButton != 0 &&
            MatchingTextValidator.heldButton != this.pressedButton) {
            if (this.containsPoint(ResourcePreparationEntry.pointerY, parentY, parentX, obfuscationGuard + 3, MusicPatch.pointerX) &&
              MatchingTextValidator.heldButton == 0) {
              this.dispatchAction(ResourcePreparationEntry.pointerY - parentY, this.pressedButton, -79, -parentX + MusicPatch.pointerX);
            }
            this.handlePointerRelease(ResourcePreparationEntry.pointerY, MusicPatch.pointerX, parentY, focusRoot, 19223, parentX);
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "d.WA(" + (focusRoot != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + parentX + ',' + parentY + ')');
        }
    }

    boolean handleWidgetKey(int keyCode, byte obfuscationGuard, Widget focusRoot, char character) {
        RuntimeException var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 110) {
            return false;
          }
          if (!this.isFocused(-103)) {
            return false;
          }
          if (keyCode != 84 &&
            keyCode != 83) {
            return false;
          }
          this.dispatchAction(-1, 1, -18, -1);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("d.T(").append(keyCode).append(',').append(obfuscationGuard).append(',');
          if (focusRoot == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(character).append(')').toString());
        }
    }

    final void handlePointerRelease(int pointerY, int pointerX, int parentY, Widget focusRoot, int obfuscationGuard, int parentX) {
        try {
          if (null != this.listener &&
            this.listener instanceof WidgetPointerListener) {
            ((WidgetPointerListener) (this.listener)).onPointerRelease((byte) 10, parentY, pointerY, this, parentX, pointerX);
          }
          if (obfuscationGuard != 19223) {
            this.isFocused(87);
          }
          this.pressedButton = 0;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "d.GA(" + pointerY + ',' + pointerX + ',' + parentY + ',' + (focusRoot != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + parentX + ')');
        }
    }

    final boolean isFocused(int obfuscationGuard) {
        if (obfuscationGuard < -49) {
          return this.focused;
        }
        Widget var3 = (Widget) null;
        this.handlePointerPress((Widget) null, -26, 22, -12, 8, -95, 39);
        return this.focused;
    }

    protected FocusableWidget() {
        this.focusable = true;
        this.focused = false;
        this.enabled = true;
        this.renderer = PopupWidgetLayer.widgetTheme.emptyFocusableRenderer;
    }

    static {
        field_D = "Achievements";
        recentRenderRate = 0;
        field_G = "Join <%0>'s game";
    }
}
