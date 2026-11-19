/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class TextButton extends UiWidget {
    private boolean field_y;
    static IntegerSyntaxHelpers field_E;
    static int field_A;
    boolean field_B;
    private boolean focused;
    boolean selected;
    static boolean field_D;

    final StringBuilder appendDebugTree(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginDebugDescription(param3, param0, param2, true)) {
            this.appendDebugProperties(115, param2, param0, param3);
            if (this.selected) {
              discarded$2 = param3.append(" active");
            }
            if (!this.field_B) {
              discarded$3 = param3.append(" disabled");
            }
          }
          if (param1 != 102) {
            this.focused = true;
          }
          stackIn_9_0 = (StringBuilder) (param3);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("pl.U(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void handleMouseRelease(int param0, int param1, int param2, int param3, UiWidget param4, int param5) {
        try {
          if (this.listener != null &&
            this.listener instanceof ButtonPointerListener) {
            ((ButtonPointerListener) (this.listener)).onPointerReleased(param0, this, param1, param2, true, param3);
          }
          this.pressedMouseButton = param5;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "pl.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    TextButton(String param0, WidgetListener param1) {
        this(param0, ValidationIndicator.field_H.field_c, param1);
    }

    final static NameAvailabilityRequest a(int param0, String param1) {
        RuntimeException var2 = null;
        NameAvailabilityRequest stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_10_0 = null;
        NameAvailabilityRequest stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            stackIn_2_0 = (NameAvailabilityRequest) null;
            return stackIn_2_0;
          }
          if (wc.field_j == field_E) {
            stackIn_5_0 = null;
            return (NameAvailabilityRequest) (stackIn_5_0);
          }
          if (wc.field_j == SingleChildWidget.field_z &&
            param1.equals(LoginForm.field_I)) {
            wc.field_j = ej.field_b;
            stackIn_12_0 = kd.field_a;
            return stackIn_12_0;
          }
          kd.field_a = null;
          LoginForm.field_I = param1;
          wc.field_j = field_E;
          stackIn_10_0 = null;
          return (NameAvailabilityRequest) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("pl.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    void fireButtonAction(int param0, int param1, int param2, int param3) {
        if (param0 >= -45) {
          this.isFocused((byte) -65);
          if (this.listener != null) {
            if (this.listener instanceof ButtonActionListener) {
              ((ButtonActionListener) (this.listener)).onButtonAction(-18905, this, param3, param2, param1);
            }
            return;
          }
          return;
        }
        if (this.listener == null) {
          return;
        }
        if (this.listener instanceof ButtonActionListener) {
          ((ButtonActionListener) (this.listener)).onButtonAction(-18905, this, param3, param2, param1);
          return;
        }
    }

    boolean requestFocus(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.field_B) {
            return false;
          }
          if (!this.field_y) {
            return false;
          }
          param0.clearFocus(false);
          this.focused = true;
          if (this.listener != null &&
            this.listener instanceof ButtonPressListener) {
            ((ButtonPressListener) (this.listener)).onPressedChanged((UiWidget) (this), param1 ^ -19983, this.focused);
          }
          if (param1 != 8) {
            TextButton.a(92);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("pl.J(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    boolean handleMousePress(int param0, byte param1, int param2, int param3, int param4, int param5, UiWidget param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = 16 / ((param1 - 12) / 36);
          if (this.field_B &&
            this.containsPoint(param5, param2, 0, param0, param3)) {
            this.requestFocus(param6, 8);
            this.pressedMouseButton = param4;
            if (this.listener != null) {
              if (!(this.listener instanceof ButtonPointerListener)) {
                return true;
              }
              ((ButtonPointerListener) (this.listener)).onPointerPressed(this, param4, param5, (byte) -17, param0, param2, param3);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_12_0 = var8;
          stackIn_12_1 = new StringBuilder().append("pl.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    void updateInput(int param0, int param1, int param2, UiWidget param3) {
        try {
          super.updateInput(param0, param1, param2, param3);
          if (this.pressedMouseButton != 0) {
            if (BrowserUrlLauncher.field_c == this.pressedMouseButton) {
              return;
            }
            if (this.containsPoint(NetworkArchiveRequest.field_B, AchievementSubmission.field_n, 0, param2, param1) &&
              0 == BrowserUrlLauncher.field_c) {
              this.fireButtonAction(-88, AchievementSubmission.field_n - param2, -param1 + NetworkArchiveRequest.field_B, this.pressedMouseButton);
            }
            this.handleMouseRelease(param2, NetworkArchiveRequest.field_B, param1, AchievementSubmission.field_n, param3, 0);
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "pl.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean isFocused(byte param0) {
        if (param0 != 53) {
          TextButton.a(49);
          return this.focused;
        }
        return this.focused;
    }

    boolean handleKeyPress(char param0, int param1, byte param2, UiWidget param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -96) {
            return true;
          }
          if (!this.isFocused((byte) 53)) {
            return false;
          }
          if (84 != param1 &&
            param1 != 83) {
            return false;
          }
          this.fireButtonAction(-117, -1, -1, 1);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("pl.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static String a(int param0) {
        if (param0 != 0) {
          return (String) null;
        }
        if (NetworkArchiveRequest.field_y == field_E) {
          return EmailCheckRequest.field_a;
        }
        return GrowableIntList.field_e;
    }

    final void clearFocus(boolean param0) {
        if (param0) {
          return;
        }
        if (!this.focused) {
          return;
        }
        this.focused = false;
        if (this.listener == null) {
          return;
        }
        if (this.listener instanceof ButtonPressListener) {
          ((ButtonPressListener) (this.listener)).onPressedChanged((UiWidget) (this), -19975, this.focused);
          return;
        }
    }

    public static void releaseStatics(boolean param0) {
        field_E = null;
        if (!param0) {
          TextButton.a(68);
        }
    }

    protected TextButton() {
        this.field_y = true;
        this.field_B = true;
        this.focused = false;
        this.renderer = ValidationIndicator.field_H.field_n;
    }

    TextButton(String param0, WidgetRenderer param1, WidgetListener param2) {
        super(param0, param1, param2);
        this.field_y = true;
        this.field_B = true;
        this.focused = false;
    }

    static {
        field_A = 0;
        field_D = false;
        field_E = new IntegerSyntaxHelpers();
    }
}
