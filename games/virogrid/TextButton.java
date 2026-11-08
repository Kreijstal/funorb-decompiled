/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class TextButton extends UiWidget {
    boolean field_z;
    static FrameSkin field_D;
    static int[] field_A;
    private boolean field_E;
    static String field_y;
    private boolean field_B;
    static int field_x;
    boolean field_C;

    TextButton(String param0, WidgetListener param1, UiListener param2) {
        super(param0, param1, param2);
        this.field_E = false;
        this.field_B = true;
        this.field_C = true;
    }

    final void clearKeyboardFocus(int param0) {
        if (param0 != -1) {
          return;
        }
        if (!this.field_E) {
          return;
        }
        this.field_E = false;
        if (this.field_o == null) {
          return;
        }
        if (this.field_o instanceof FocusChangeListener) {
          ((FocusChangeListener) (this.field_o)).onFocusChanged(this.field_E, (UiWidget) (this), 97);
          return;
        }
    }

    void updatePointer(int param0, int param1, UiWidget param2, int param3) {
        try {
          super.updatePointer(param0, 125, param2, param3);
          if (param1 <= 113) {
            this.clearKeyboardFocus(-62);
          }
          if (this.field_i != 0) {
            if (this.field_i == NodeHashTableIterator.field_e) {
              return;
            }
            if (this.containsPointer(param3, StatefulWidgetPainter.field_u, IconTextComponent.field_Jb, (byte) 79, param0) &&
              NodeHashTableIterator.field_e == 0) {
              this.activate((byte) 48, this.field_i, -param3 + IconTextComponent.field_Jb, StatefulWidgetPainter.field_u - param0);
            }
            this.handlePointerRelease(IconTextComponent.field_Jb, StatefulWidgetPainter.field_u, param0, param2, param3, 99);
          }
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "tg.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    void activate(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        if (null == this.field_o) {
          var5 = 61 / ((param0 + 33) / 42);
          return;
        }
        if (this.field_o instanceof ButtonActionListener) {
          ((ButtonActionListener) (this.field_o)).onAction(12085, this, param1, param2, param3);
          var5Lifetime1 = 61 / ((param0 + 33) / 42);
          return;
        }
        var5Lifetime2 = 61 / ((param0 + 33) / 42);
    }

    final boolean isFocused(boolean param0) {
        if (!param0) {
          TextButton.releaseStatics((byte) 76);
          return this.field_E;
        }
        return this.field_E;
    }

    final void handlePointerRelease(int param0, int param1, int param2, UiWidget param3, int param4, int param5) {
        RuntimeException var7 = null;
        StringBuilder var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.field_o &&
            this.field_o instanceof ButtonPointerListener) {
            ((ButtonPointerListener) (this.field_o)).onButtonReleased(param0, param1, param4, -20637, this, param2);
          }
          this.field_i = 0;
          if (param5 >= 73) {
            return;
          }
          var8 = (StringBuilder) null;
          this.appendDebugTree((Hashtable) null, (byte) 73, -4, (StringBuilder) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("tg.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    boolean focusNext(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.field_C) {
            return false;
          }
          if (!this.field_B) {
            return false;
          }
          param0.clearKeyboardFocus(-1);
          if (param1 != -8515) {
            return true;
          }
          this.field_E = true;
          if (this.field_o != null &&
            this.field_o instanceof FocusChangeListener) {
            ((FocusChangeListener) (this.field_o)).onFocusChanged(this.field_E, (UiWidget) (this), 91);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("tg.G(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

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
          if (this.beginWidgetDiagnosticVisit(param0, param2, 34, param3)) {
            this.appendWidgetDiagnosticProperties(param2, param0, (byte) 126, param3);
            if (this.field_z) {
              discarded$2 = param3.append(" active");
            }
            if (!this.field_C) {
              discarded$3 = param3.append(" disabled");
            }
          }
          if (param1 < 118) {
            this.field_z = true;
          }
          stackIn_9_0 = (StringBuilder) (param3);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("tg.MA(");
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
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 >= -51) {
          return;
        }
        field_y = null;
        field_A = null;
        field_D = null;
    }

    boolean handlePointerPress(UiWidget param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_C &&
            this.containsPointer(param5, param6, param4, (byte) 58, param3)) {
            this.focusNext(param0, -8515);
            this.field_i = param1;
            if (this.field_o != null) {
              if (!(this.field_o instanceof ButtonPointerListener)) {
                return true;
              }
              ((ButtonPointerListener) (this.field_o)).onButtonPressed(param1, this, param6, param4, (byte) 111, param5, param3);
            }
            return true;
          }
          if (param2) {
            field_y = (String) null;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("tg.NA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    TextButton(String param0, UiListener param1) {
        this(param0, PasswordLoginCredentials.field_g.field_l, param1);
    }

    boolean handleKeyInput(UiWidget param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -117 % ((-75 - param3) / 36);
          if (this.isFocused(true) && (84 == param2 ||
            83 == param2)) {
            this.activate((byte) -97, 1, -1, -1);
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("tg.AA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    protected TextButton() {
        this.field_E = false;
        this.field_B = true;
        this.field_C = true;
        this.listener = PasswordLoginCredentials.field_g.field_b;
    }

    static {
        field_x = 0;
        field_y = "Withdraw request to join <%0>'s game";
    }
}
