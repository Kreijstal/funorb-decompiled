/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class InteractiveWidget extends UiWidget {
    boolean field_H;
    private boolean field_G;
    private boolean field_F;
    static boolean field_D;
    boolean field_E;

    boolean handleKey(char param0, UiWidget param1, byte param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.isFocused(-100) && (param3 == 84 ||
            param3 == 83)) {
            this.activateFromInput(-1, -1, -1, 1);
            return true;
          }
          if (param2 == -79) {
            return false;
          }
          this.field_E = false;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("hc.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 <= 6) {
          return false;
        }
        if (param4 < param3) {
          return false;
        }
        if (param4 >= param5 + param3) {
          return false;
        }
        if (param1 > param6) {
          return false;
        }
        if (param6 < param1 + param2) {
          return true;
        }
        return false;
    }

    final StringBuilder appendDebugTree(byte param0, Hashtable param1, int param2, StringBuilder param3) {
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
          if (this.beginDebugTreeEntry(param3, true, param2, param1)) {
            this.appendDebugProperties(param1, param3, 34, param2);
            if (this.field_H) {
              discarded$2 = param3.append(" active");
            }
            if (!this.field_E) {
              discarded$3 = param3.append(" disabled");
            }
          }
          if (param0 != -70) {
            this.field_F = false;
          }
          stackIn_10_0 = (StringBuilder) (param3);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("hc.SA(").append(param0).append(',');
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
          throw lj.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    boolean takeFocus(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 119) {
            this.activateFromInput(93, 90, 39, -108);
          }
          if (this.field_E &&
            this.field_F) {
            param0.blur(4966);
            this.field_G = true;
            if (this.field_y != null) {
              if (!(this.field_y instanceof WidgetFocusListener)) {
                return true;
              }
              ((WidgetFocusListener) (this.field_y)).onWidgetFocusChanged(this.field_G, 19392, (UiWidget) (this));
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("hc.UA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final void blur(int param0) {
        if (!this.field_G) {
          if (param0 == 4966) {
            return;
          }
          this.field_F = false;
          return;
        }
        this.field_G = false;
        if (this.field_y == null) {
          if (param0 == 4966) {
            return;
          }
          this.field_F = false;
          return;
        }
        if (!(this.field_y instanceof WidgetFocusListener)) {
          if (param0 == 4966) {
            return;
          }
          this.field_F = false;
          return;
        }
        ((WidgetFocusListener) (this.field_y)).onWidgetFocusChanged(this.field_G, 19392, (UiWidget) (this));
        if (param0 == 4966) {
          return;
        }
        this.field_F = false;
    }

    final boolean isFocused(int param0) {
        int var2 = -28 / ((param0 + 33) / 45);
        return this.field_G;
    }

    InteractiveWidget(String param0, WidgetRenderer param1, WidgetEventListener param2) {
        super(param0, param1, param2);
        this.field_G = false;
        this.field_F = true;
        this.field_E = true;
    }

    void activateFromInput(int param0, int param1, int param2, int param3) {
        if (null == this.field_y) {
          if (param0 == -1) {
            return;
          }
          this.blur(-9);
          return;
        }
        if (!(this.field_y instanceof WidgetActivationListener)) {
          if (param0 == -1) {
            return;
          }
          this.blur(-9);
          return;
        }
        ((WidgetActivationListener) (this.field_y)).onWidgetActivated(param2, (byte) 6, this, param3, param1);
        if (param0 == -1) {
          return;
        }
        this.blur(-9);
    }

    void updatePointer(int param0, int param1, byte param2, UiWidget param3) {
        try {
          if (param2 <= 49) {
            UiWidget var6 = (UiWidget) null;
            this.handleKey('ﾰ', (UiWidget) null, (byte) 26, -48);
          }
          super.updatePointer(param0, param1, (byte) 56, param3);
          if (this.field_w != 0 &&
            this.field_w != CipherPacketBuffer.field_B) {
            if (this.containsPointer(NodeHashTableIterator.field_e, param1, param0, nk.field_w, -118) &&
              0 == CipherPacketBuffer.field_B) {
              this.activateFromInput(-1, -param1 + nk.field_w, NodeHashTableIterator.field_e - param0, this.field_w);
            }
            this.pointerReleased(param1, NodeHashTableIterator.field_e, nk.field_w, param0, param3, 0);
          }
        } catch (RuntimeException runtimeException) {
          throw lj.wrapClientException((Throwable) ((Object) runtimeException), "hc.V(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    InteractiveWidget(String param0, WidgetEventListener param1) {
        this(param0, AccountRequestState.field_c.field_m, param1);
    }

    final void pointerReleased(int param0, int param1, int param2, int param3, UiWidget param4, int param5) {
        try {
          if (this.field_y != null &&
            this.field_y instanceof WidgetPointerListener) {
            ((WidgetPointerListener) (this.field_y)).onWidgetPointerReleased(param0, param1, param3, this, param2, param5 ^ -2048);
          }
          this.field_w = param5;
        } catch (RuntimeException runtimeException) {
          throw lj.wrapClientException((Throwable) ((Object) runtimeException), "hc.LA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    boolean pointerPressed(int param0, int param1, int param2, int param3, int param4, UiWidget param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_E &&
            this.containsPointer(param3, param6, param1, param0, param2 - 98)) {
            this.takeFocus(param5, 127);
            this.field_w = param4;
            if (null != this.field_y &&
              this.field_y instanceof WidgetPointerListener) {
              ((WidgetPointerListener) (this.field_y)).onWidgetPointerPressed(param0, param6, param4, param1, -31561, this, param3);
            }
            return true;
          }
          if (param2 == 0) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("hc.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param6).append(')').toString());
        }
    }

    protected InteractiveWidget() {
        this.field_G = false;
        this.field_F = true;
        this.field_E = true;
        this.field_A = AccountRequestState.field_c.field_o;
    }

    static {
        field_D = false;
    }
}
