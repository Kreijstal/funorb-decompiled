/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class InteractiveWidget extends UiWidget {
    static int field_x;
    static sh field_A;
    private boolean field_z;
    private boolean field_B;
    static String[] field_E;
    static BufferedRandomAccessFile field_y;
    boolean field_D;
    boolean field_F;
    static PacketBuffer field_C;

    public static void resetStaticState(int param0) {
        field_y = null;
        field_A = null;
        if (param0 > 7) {
          field_E = null;
          field_C = null;
          return;
        }
        field_x = -57;
        field_E = null;
        field_C = null;
    }

    final void blur(int param0) {
        if (param0 != 0) {
          StringBuilder var3 = (StringBuilder) null;
          this.appendDebugTree((byte) 0, (Hashtable) null, -79, (StringBuilder) null);
          if (!this.field_z) {
            return;
          }
          this.field_z = false;
          if (null == this.field_h) {
            return;
          }
          if (this.field_h instanceof WidgetFocusListener) {
            ((WidgetFocusListener) (this.field_h)).onWidgetFocusChanged((UiWidget) (this), this.field_z, param0 ^ -119);
            return;
          }
          return;
        }
        if (!this.field_z) {
          return;
        }
        this.field_z = false;
        if (null == this.field_h) {
          return;
        }
        if (this.field_h instanceof WidgetFocusListener) {
          ((WidgetFocusListener) (this.field_h)).onWidgetFocusChanged((UiWidget) (this), this.field_z, param0 ^ -119);
          return;
        }
    }

    final StringBuilder appendDebugTree(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_9_0 = null;
        StringBuilder stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginDebugTreeEntry(9882, param3, param2, param1)) {
            this.appendDebugProperties(param2, (byte) -122, param1, param3);
            if (this.field_D) {
              discarded$2 = param3.append(" active");
            }
            if (!this.field_F) {
              discarded$3 = param3.append(" disabled");
            }
          }
          if (param0 < -23) {
            stackIn_11_0 = (StringBuilder) (param3);
            return stackIn_11_0;
          }
          stackIn_9_0 = (StringBuilder) null;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("s.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final boolean isFocused(int param0) {
        if (param0 != -81) {
          return true;
        }
        return this.field_z;
    }

    InteractiveWidget(String param0, WidgetRenderer param1, WidgetEventListener param2) {
        super(param0, param1, param2);
        this.field_B = true;
        this.field_z = false;
        this.field_F = true;
    }

    void activateFromInput(int param0, int param1, int param2, int param3) {
        if (param0 != 84) {
          this.field_F = true;
          if (null != this.field_h) {
            if (this.field_h instanceof WidgetActivationListener) {
              ((WidgetActivationListener) (this.field_h)).onWidgetActivated((byte) -115, param3, param1, this, param2);
            }
            return;
          }
          return;
        }
        if (null == this.field_h) {
          return;
        }
        if (this.field_h instanceof WidgetActivationListener) {
          ((WidgetActivationListener) (this.field_h)).onWidgetActivated((byte) -115, param3, param1, this, param2);
          return;
        }
    }

    final void pointerReleased(int param0, int param1, byte param2, UiWidget param3, int param4, int param5) {
        if (this.field_h != null &&
          this.field_h instanceof WidgetPointerListener) {
          ((WidgetPointerListener) (this.field_h)).onWidgetPointerReleased(param5, 4071, param0, param4, param1, this);
        }
        if (param2 >= -91) {
          return;
        }
        try {
          this.field_v = 0;
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "s.J(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    boolean pointerPressed(byte param0, UiWidget param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        UiWidget var9 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -115) {
            var9 = (UiWidget) null;
            this.updatePointer((byte) -30, (UiWidget) null, 51, 84);
          }
          if (this.field_F &&
            this.containsPointer((byte) 3, param5, param4, param6, param3)) {
            this.takeFocus(-81, param1);
            this.field_v = param2;
            if (null != this.field_h) {
              if (!(this.field_h instanceof WidgetPointerListener)) {
                return true;
              }
              ((WidgetPointerListener) (this.field_h)).onWidgetPointerPressed(param2, param5, param4, this, param3, param6, (byte) 1);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("s.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void updatePointer(byte param0, UiWidget param1, int param2, int param3) {
        try {
          super.updatePointer(param0, param1, param2, param3);
          if (this.field_v != 0) {
            if (this.field_v == of.field_G) {
              return;
            }
            if (this.containsPointer((byte) 3, ua.field_a, DiskCacheWorker.field_d, param3, param2) &&
              0 == of.field_G) {
              this.activateFromInput(84, DiskCacheWorker.field_d - param3, this.field_v, -param2 + ua.field_a);
            }
            this.pointerReleased(param3, ua.field_a, (byte) -103, param1, param2, DiskCacheWorker.field_d);
          }
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "s.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean handleKey(char param0, int param1, UiWidget param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 0) {
            this.field_B = true;
          }
          if (this.isFocused(-81) && (84 == param1 ||
            param1 == 83)) {
            this.activateFromInput(param3 ^ 84, -1, 1, -1);
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("s.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean takeFocus(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_F &&
            this.field_B) {
            if (param0 != -81) {
              return false;
            }
            param1.blur(0);
            this.field_z = true;
            if (this.field_h != null &&
              this.field_h instanceof WidgetFocusListener) {
              ((WidgetFocusListener) (this.field_h)).onWidgetFocusChanged((UiWidget) (this), this.field_z, 22);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("s.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    InteractiveWidget(String param0, WidgetEventListener param1) {
        this(param0, mb.field_a.field_l, param1);
    }

    protected InteractiveWidget() {
        this.field_B = true;
        this.field_z = false;
        this.field_F = true;
        this.field_j = mb.field_a.field_c;
    }

    static {
        field_A = null;
        field_E = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
