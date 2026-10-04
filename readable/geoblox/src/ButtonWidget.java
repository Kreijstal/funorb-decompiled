/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ButtonWidget extends UiWidget {
    boolean active;
    static AccountContentDialog field_C;
    static int field_B;
    private boolean focusable;
    boolean enabled;
    static TextValidationFailure field_x;
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
          pressFailureBeforeContext = pointerPressFailure;
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
        this(text, DialRenderer.field_j.field_j, listener);
    }

    void updatePointerState(boolean hoverGuard, int parentY, UiWidget eventContext, int parentX) {
        try {
            super.updatePointerState(hoverGuard, parentY, eventContext, parentX);
            if (0 != this.pressedPointerButton) {
                if (EntityCollisionSupport.heldPointerButtonSnapshot == this.pressedPointerButton) {
                    return;
                }
                if ((this.containsPointer(PrefixCodeDecoder.pointerXSnapshot, -1, PcmResampler.pointerYSnapshot, parentY, parentX)) &&
                    (!(EntityCollisionSupport.heldPointerButtonSnapshot != 0))) {
                    this.activateButton(PcmResampler.pointerYSnapshot - parentY, -28922, PrefixCodeDecoder.pointerXSnapshot - parentX, this.pressedPointerButton);
                }
                this.handlePointerRelease(parentX, PrefixCodeDecoder.pointerXSnapshot, !hoverGuard ? true : false, eventContext, parentY, PcmResampler.pointerYSnapshot);
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
          keyFailureBeforeContext = keyInputFailure;
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
        StatefulWidgetRenderer.c(520);
        MidiNote.setPendingLoginUiAction(4, false);
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
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("hk.UA(").append(methodGuard).append(',');
          if (focusContext == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final StringBuilder appendWidgetDiagnostics(int methodGuard, StringBuilder output, Hashtable visitedWidgets, int depth) {
        StringBuilder discardedActiveAppend = null;
        StringBuilder discardedDisabledAppend = null;
        RuntimeException widgetDiagnosticFailure = null;
        StringBuilder diagnosticOutputSnapshot = null;
        RuntimeException diagnosticFailureForContext = null;
        StringBuilder diagnosticContextBuilder = null;
        String outputDescription = null;
        StringBuilder diagnosticContextAfterOutput = null;
        String visitedWidgetsDescription = null;
        RuntimeException caughtDiagnosticFailure = null;
        try {
          if (methodGuard != 0) {
            ButtonWidget.e(-5);
          }
          if (this.beginWidgetDiagnosticVisit(output, depth, 10095, visitedWidgets)) {
            this.appendWidgetDiagnosticProperties(depth, visitedWidgets, 34, output);
            if (this.active) {
              discardedActiveAppend = output.append(" active");
            }
            if (!this.enabled) {
              discardedDisabledAppend = output.append(" disabled");
            }
          }
          diagnosticOutputSnapshot = (StringBuilder) (output);
          return diagnosticOutputSnapshot;
        } catch (java.lang.RuntimeException diagnosticFailure) {
          caughtDiagnosticFailure = diagnosticFailure;
          widgetDiagnosticFailure = caughtDiagnosticFailure;
          diagnosticFailureForContext = widgetDiagnosticFailure;
          diagnosticContextBuilder = new StringBuilder().append("hk.PA(").append(methodGuard).append(',');
          if (output == null) {
            outputDescription = "null";
          } else {
            outputDescription = "{...}";
          }
          diagnosticContextAfterOutput = ((StringBuilder) (Object) diagnosticContextBuilder).append(outputDescription).append(',');
          if (visitedWidgets == null) {
            visitedWidgetsDescription = "null";
          } else {
            visitedWidgetsDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) diagnosticFailureForContext), ((StringBuilder) (Object) diagnosticContextAfterOutput).append(visitedWidgetsDescription).append(',').append(depth).append(')').toString());
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
        this.renderer = DialRenderer.field_j.field_l;
    }

    static {
        field_B = 0;
        field_x = new TextValidationFailure();
    }
}
