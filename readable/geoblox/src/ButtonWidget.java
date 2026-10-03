/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ButtonWidget extends UiWidget {
    boolean field_y;
    static ei field_C;
    static int field_B;
    private boolean field_z;
    boolean enabled;
    static nd field_x;
    private boolean focused;

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, UiWidget param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if ((this.enabled) &&
              (this.containsPointer(param4, -1, param5, param0, param2))) {
            this.requestKeyboardFocus((byte) -116, param6);
            this.pressedPointerButton = param3;
            if (null != this.listener) {
              if (!(this.listener instanceof ti)) {
                return true;
              }
              ((ti) ((Object) this.listener)).a(param0, -30896, param2, param4, (ButtonWidget) (this), param3, param5);
            }
            return true;
          }
          var8_int = 4 / ((param1 + 3) / 38);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_13_0 = (RuntimeException) (var8);
          stackIn_13_1 = new StringBuilder().append("hk.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (null != this.listener) {
            if (!(this.listener instanceof ButtonActivationListener)) {
                if (param1 != -28922) {
                    field_B = -42;
                    return;
                }
                return;
            }
            ((ButtonActivationListener) ((Object) this.listener)).onButtonActivated(param2, (byte) -20, param0, param3, (ButtonWidget) (this));
        }
        if (param1 == -28922) {
            return;
        }
        field_B = -42;
    }

    public static void f(byte param0) {
        field_x = null;
        int var1 = -17 % ((param0 - 54) / 53);
        field_C = null;
    }

    ButtonWidget(String param0, WidgetListener param1) {
        this(param0, hb.field_j.field_j, param1);
    }

    void a(boolean param0, int param1, UiWidget param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            if (0 != this.pressedPointerButton) {
                if (gf.heldPointerButtonSnapshot == this.pressedPointerButton) {
                    return;
                }
                if ((this.containsPointer(PrefixCodeDecoder.pointerXSnapshot, -1, ue.pointerYSnapshot, param1, param3)) &&
                    (!(gf.heldPointerButtonSnapshot != 0))) {
                    this.a(ue.pointerYSnapshot - param1, -28922, PrefixCodeDecoder.pointerXSnapshot - param3, this.pressedPointerButton);
                }
                this.a(param3, PrefixCodeDecoder.pointerXSnapshot, !param0 ? true : false, param2, param1, ue.pointerYSnapshot);
            }
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "hk.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    ButtonWidget(String param0, WidgetRenderer param1, WidgetListener param2) {
        super(param0, param1, param2);
        this.enabled = true;
        this.field_z = true;
        this.focused = false;
    }

    boolean handleKeyInput(int param0, int param1, char param2, UiWidget param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.hasKeyboardFocus((byte) 54)) {
            if (!((param0 != 84) &&
                (param0 != 83))) {
              this.a(-1, -28922, -1, 1);
              return true;
            }
          }
          if (param1 == 13) {
            return false;
          }
          this.field_y = true;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = (RuntimeException) (var5);
          stackIn_12_1 = new StringBuilder().append("hk.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
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
            this.field_y = false;
            if (!this.focused) {
                return;
            }
            this.focused = false;
            if (null == this.listener) {
                return;
            }
            if (!(this.listener instanceof rk)) {
                return;
            }
            ((rk) ((Object) this.listener)).a(3520, (UiWidget) (this), this.focused);
            return;
        }
        if (!this.focused) {
            return;
        }
        this.focused = false;
        if (null == this.listener) {
            return;
        }
        if (!(this.listener instanceof rk)) {
            return;
        }
        ((rk) ((Object) this.listener)).a(3520, (UiWidget) (this), this.focused);
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
              (this.field_z)) {
            focusContext.clearKeyboardFocus(-128);
            this.focused = true;
            if ((null != this.listener) &&
                (this.listener instanceof rk)) {
              ((rk) ((Object) this.listener)).a(3520, (UiWidget) (this), this.focused);
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
            if (this.field_y) {
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

    final void a(int param0, int param1, boolean param2, UiWidget param3, int param4, int param5) {
        if (null != this.listener && this.listener instanceof ti) {
            ((ti) ((Object) this.listener)).a(param4, param5, (byte) 55, (ButtonWidget) (this), param0, param1);
        }
        if (!param2) {
            return;
        }
        try {
            this.pressedPointerButton = 0;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "hk.TA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    protected ButtonWidget() {
        this.enabled = true;
        this.field_z = true;
        this.focused = false;
        this.renderer = hb.field_j.field_l;
    }

    static {
        field_B = 0;
        field_x = new nd();
    }
}
