/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ButtonWidget extends UiWidget {
    boolean active;
    static ei field_C;
    static int field_B;
    private boolean focusable;
    boolean enabled;
    static nd field_x;
    private boolean focused;

    boolean handlePointerPress(int parentY, int methodGuard, int parentX, int pointerButton, int pointerX, int pointerY, UiWidget eventContext) {
        int guardResidue = 0;
        RuntimeException pointerPressFailure = null;
        RuntimeException pressFailureBeforeContext = null;
        StringBuilder pressFailureContextBuilder = null;
        String eventContextDescription = null;
        RuntimeException caughtPointerPressException = null;
        try {
          if ((this.enabled) &&
              (this.containsPointer(pointerX, -1, pointerY, parentY, parentX))) {
            this.requestKeyboardFocus((byte) -116, eventContext);
            this.pressedPointerButton = pointerButton;
            if (null != this.listener) {
              if (!(this.listener instanceof ButtonPointerListener)) {
                return true;
              }
              ((ButtonPointerListener) ((Object) this.listener)).onButtonPointerPressed(parentY, -30896, parentX, pointerX, (ButtonWidget) (this), pointerButton, pointerY);
            }
            return true;
          }
          guardResidue = 4 / ((methodGuard + 3) / 38);
          return false;
        } catch (java.lang.RuntimeException caughtPointerPressFailure) {
          caughtPointerPressException = caughtPointerPressFailure;
          pointerPressFailure = caughtPointerPressException;
          pressFailureBeforeContext = (RuntimeException) (pointerPressFailure);
          pressFailureContextBuilder = new StringBuilder().append("hk.D(").append(parentY).append(',').append(methodGuard).append(',').append(parentX).append(',').append(pointerButton).append(',').append(pointerX).append(',').append(pointerY).append(',');
          if (eventContext == null) {
            eventContextDescription = "null";
          } else {
            eventContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) pressFailureBeforeContext), ((StringBuilder) (Object) pressFailureContextBuilder).append(eventContextDescription).append(')').toString());
        }
    }

    void activateButton(int buttonY, int methodGuard, int buttonX, int pointerButton) {
        if (null != this.listener) {
            if (!(this.listener instanceof ButtonActivationListener)) {
                if (methodGuard != -28922) {
                    field_B = -42;
                    return;
                }
                return;
            }
            ((ButtonActivationListener) ((Object) this.listener)).onButtonActivated(buttonX, (byte) -20, buttonY, pointerButton, (ButtonWidget) (this));
        }
        if (methodGuard == -28922) {
            return;
        }
        field_B = -42;
    }

    public static void f(byte param0) {
        field_x = null;
        int var1 = -17 % ((param0 - 54) / 53);
        field_C = null;
    }

    ButtonWidget(String text, WidgetListener listener) {
        this(text, hb.field_j.field_j, listener);
    }

    void updatePointerState(boolean hoverGuard, int parentY, UiWidget eventContext, int parentX) {
        try {
            super.updatePointerState(hoverGuard, parentY, eventContext, parentX);
            if (0 != this.pressedPointerButton) {
                if (gf.heldPointerButtonSnapshot == this.pressedPointerButton) {
                    return;
                }
                if ((this.containsPointer(PrefixCodeDecoder.pointerXSnapshot, -1, ue.pointerYSnapshot, parentY, parentX)) &&
                    (!(gf.heldPointerButtonSnapshot != 0))) {
                    this.activateButton(ue.pointerYSnapshot - parentY, -28922, PrefixCodeDecoder.pointerXSnapshot - parentX, this.pressedPointerButton);
                }
                this.handlePointerRelease(parentX, PrefixCodeDecoder.pointerXSnapshot, !hoverGuard ? true : false, eventContext, parentY, ue.pointerYSnapshot);
            }
        } catch (RuntimeException pointerUpdateFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) pointerUpdateFailure), "hk.H(" + hoverGuard + ',' + parentY + ',' + (eventContext != null ? "{...}" : "null") + ',' + parentX + ')');
        }
    }

    ButtonWidget(String text, WidgetRenderer renderer, WidgetListener listener) {
        super(text, renderer, listener);
        this.enabled = true;
        this.focusable = true;
        this.focused = false;
    }

    boolean handleKeyInput(int keyCode, int methodGuard, char typedCharacter, UiWidget eventContext) {
        RuntimeException keyInputFailure = null;
        RuntimeException keyFailureBeforeContext = null;
        StringBuilder keyFailureContextBuilder = null;
        String eventContextDescription = null;
        RuntimeException caughtKeyInputException = null;
        try {
          if (this.hasKeyboardFocus((byte) 54)) {
            if (!((keyCode != 84) &&
                (keyCode != 83))) {
              this.activateButton(-1, -28922, -1, 1);
              return true;
            }
          }
          if (methodGuard == 13) {
            return false;
          }
          this.active = true;
          return false;
        } catch (java.lang.RuntimeException caughtKeyInputFailure) {
          caughtKeyInputException = caughtKeyInputFailure;
          keyInputFailure = caughtKeyInputException;
          keyFailureBeforeContext = (RuntimeException) (keyInputFailure);
          keyFailureContextBuilder = new StringBuilder().append("hk.I(").append(keyCode).append(',').append(methodGuard).append(',').append(typedCharacter).append(',');
          if (eventContext == null) {
            eventContextDescription = "null";
          } else {
            eventContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) keyFailureBeforeContext), ((StringBuilder) (Object) keyFailureContextBuilder).append(eventContextDescription).append(')').toString());
        }
    }

    final boolean hasKeyboardFocus(byte methodGuard) {
        if (methodGuard != 54) {
            this.hasKeyboardFocus((byte) -35);
            return this.focused;
        }
        return this.focused;
    }

    final void clearKeyboardFocus(int methodGuard) {
        if (methodGuard >= -122) {
            this.active = false;
            if (!this.focused) {
                return;
            }
            this.focused = false;
            if (null == this.listener) {
                return;
            }
            if (!(this.listener instanceof KeyboardFocusListener)) {
                return;
            }
            ((KeyboardFocusListener) ((Object) this.listener)).onKeyboardFocusChanged(3520, (UiWidget) (this), this.focused);
            return;
        }
        if (!this.focused) {
            return;
        }
        this.focused = false;
        if (null == this.listener) {
            return;
        }
        if (!(this.listener instanceof KeyboardFocusListener)) {
            return;
        }
        ((KeyboardFocusListener) ((Object) this.listener)).onKeyboardFocusChanged(3520, (UiWidget) (this), this.focused);
    }

    final static void e(int param0) {
        rd.c(520);
        pc.a(4, false);
        if (param0 != 83) {
            ButtonWidget.f((byte) -65);
        }
    }

    boolean requestKeyboardFocus(byte methodGuard, UiWidget focusContext) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if ((this.enabled) &&
              (this.focusable)) {
            focusContext.clearKeyboardFocus(-128);
            this.focused = true;
            if ((null != this.listener) &&
                (this.listener instanceof KeyboardFocusListener)) {
              ((KeyboardFocusListener) ((Object) this.listener)).onKeyboardFocusChanged(3520, (UiWidget) (this), this.focused);
            }
            if (methodGuard <= -30) {
              return true;
            }
            this.focused = true;
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = (RuntimeException) (var3);
          stackIn_15_1 = new StringBuilder().append("hk.UA(").append(methodGuard).append(',');
          if (focusContext == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final StringBuilder a(int param0, StringBuilder param1, Hashtable param2, int param3) {
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
          if (param0 != 0) {
            ButtonWidget.e(-5);
          }
          if (this.a(param1, param3, 10095, param2)) {
            this.a(param3, param2, 34, param1);
            if (this.active) {
              discarded$2 = param1.append(" active");
            }
            if (!this.enabled) {
              discarded$3 = param1.append(" disabled");
            }
          }
          stackIn_10_0 = (StringBuilder) (param1);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = (RuntimeException) (var5);
          stackIn_13_1 = new StringBuilder().append("hk.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    final void handlePointerRelease(int parentX, int pointerX, boolean releaseGuard, UiWidget eventContext, int parentY, int pointerY) {
        if (null != this.listener && this.listener instanceof ButtonPointerListener) {
            ((ButtonPointerListener) ((Object) this.listener)).onButtonPointerReleased(parentY, pointerY, (byte) 55, (ButtonWidget) (this), parentX, pointerX);
        }
        if (!releaseGuard) {
            return;
        }
        try {
            this.pressedPointerButton = 0;
        } catch (RuntimeException pointerReleaseFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) pointerReleaseFailure), "hk.TA(" + parentX + ',' + pointerX + ',' + releaseGuard + ',' + (eventContext != null ? "{...}" : "null") + ',' + parentY + ',' + pointerY + ')');
        }
    }

    protected ButtonWidget() {
        this.enabled = true;
        this.focusable = true;
        this.focused = false;
        this.renderer = hb.field_j.field_l;
    }

    static {
        field_B = 0;
        field_x = new nd();
    }
}
